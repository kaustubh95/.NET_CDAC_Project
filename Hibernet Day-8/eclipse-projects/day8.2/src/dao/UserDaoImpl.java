package dao;

import org.apache.commons.io.FileUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.User;

import static utils.HibernateUtils.*;

import java.io.File;

public class UserDaoImpl implements IUserDao {

	@Override
	public String storeImage(int userId, String fileName) {
		Session hs = getSf().getCurrentSession();
		// tx
		Transaction tx = hs.beginTransaction();
		String mesg="Image storing failed : invalid user id";
		try {
			// get user dtls from db
			User u = hs.get(User.class, userId);
			if (u != null) {
				File f1 = new File(fileName);
				u.setImage(FileUtils.readFileToByteArray(f1));
				mesg="image uploaded succeddfully...";
			}
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			throw new RuntimeException("err in storing image", e);
		}
		return mesg;
	}

	@Override
	public String restoreImage(int userId, String fileName) {
		Session hs = getSf().getCurrentSession();
		// tx
		Transaction tx = hs.beginTransaction();
		String mesg="Image restoring failed : invalid user id";
		try {
			//get
			User u=hs.get(User.class, userId);
			if(u != null)
			{
				File f1=new File(fileName);
				FileUtils.writeByteArrayToFile(f1, u.getImage());
				mesg="image restored from DB  succeddfully...";
			}
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			throw new RuntimeException("err in restoring", e);
		}
		return mesg;
	}

}
