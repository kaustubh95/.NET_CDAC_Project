package tester;

import org.hibernate.*;

import dao.UserDaoImpl;

import static utils.HibernateUtils.*;

import java.util.Scanner;

public class ReStoreImageFromDB {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter user id n new file name to restore from db");
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println(dao.restoreImage(sc.nextInt(), sc.next()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
