package dao;

import java.util.Date;
import java.util.List;

import org.hibernate.*;
import static utils.HibernateUtils.getSf;

import pojos.User;

public class UserDaoImpl implements IUserDao {

	@Override
	public String registerUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByDate(Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUserDetails(int uid, String newPass, boolean status) {
		String mesg = "User details updation failed...";
		// hs
		Session hs = getSf().getCurrentSession();
		// tx
		Transaction tx = hs.beginTransaction();
		User u1 = null;
		try {
			// get user dtls from DB
			u1 = hs.get(User.class, uid);
			if (u1 != null) {
				// u1 --- persistent
				u1.setIsActive(status);
				u1.setPassword(newPass);
				mesg = "User dtls updated successfully";
			}
			tx.commit();// auto dirty checking --update query --l1 destroyed , cn rets to pool --session
						// closed
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		// u1 -- destached
		if (u1 != null)
			u1.setPassword("345143654654");// chaging state of detached pojo
		return mesg;
	}

	@Override
	public String bulkUpdateUsers(double discount) {
		Session hs = getSf().getCurrentSession();
		String mesg = "Updation failed....";
		String jpql = "update User u set u.regAmount = u.regAmount-:disc where u.isActive=true";
		// tx
		Transaction tx = hs.beginTransaction();

		try {
			int updateCnt = hs.createQuery(jpql).setParameter("disc", discount).executeUpdate();
			mesg = "Updated " + updateCnt + " users....";
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String deleteUserDetails(String email, String pass) {
		String mesg = "deletion failed....";
		String jpql = "select u from User u where u.email = :em and u.password=:pa";
		Session hs = getSf().getCurrentSession();
		// tx
		Transaction tx = hs.beginTransaction();

		try {
			User u = hs.createQuery(jpql, User.class).setParameter("em", email).setParameter("pa", pass)
					.getSingleResult();
			// user login valid -- u --- persistent
			hs.delete(u);
			mesg = "user details deleted successfully...";
			tx.commit();
		} catch (RuntimeException e) {
			// catches HibernateExc / no res exc.
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
