package tester;

import org.hibernate.*;

import dao.UserDaoImpl;

import static utils.HibernateUtils.*;

import java.util.Scanner;

public class BulkUpdateUserDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter discount amt");
			// dao
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println(dao.bulkUpdateUsers(sc.nextDouble()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
