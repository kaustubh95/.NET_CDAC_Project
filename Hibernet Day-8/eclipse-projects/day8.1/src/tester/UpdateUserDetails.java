package tester;

import org.hibernate.*;

import dao.UserDaoImpl;

import static utils.HibernateUtils.*;

import java.util.Scanner;

public class UpdateUserDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter user id , new pwd & status");
			// dao
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println(dao.updateUserDetails(sc.nextInt(), sc.next(), sc.nextBoolean()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
