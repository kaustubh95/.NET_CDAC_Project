package tester;

/*
 * How to convert java object to json
 */
import model.Person;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJavaToJson {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Person p1 = new Person(101, "ravi");
			String s = mapper.writeValueAsString(p1);
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
