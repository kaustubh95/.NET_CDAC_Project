package tester;

/*
 * How to convert java object to json & store it in a file
 */
import java.io.File;

import model.Person;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJavaToJsonInFile {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Person p1 = new Person(101, "ravi");
			mapper.writeValue(new File("test1.json"), p1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
