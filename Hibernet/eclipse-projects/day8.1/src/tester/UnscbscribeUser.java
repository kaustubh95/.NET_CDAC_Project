package tester;

import org.hibernate.*;

import dao.UserDaoImpl;

import static utils.HibernateUtils.*;

import java.util.Scanner;

public class UnscbscribeUser {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter user email n password");
			// dao
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println(dao.deleteUserDetails(sc.next(), sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
