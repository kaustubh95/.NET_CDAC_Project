package tester;

import org.hibernate.*;

import dao.UserDaoImpl;

import static utils.HibernateUtils.*;

import java.util.Scanner;

public class StoreImage {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter user id n file name to store in db");
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println(dao.storeImage(sc.nextInt(), sc.next()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
