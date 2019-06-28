package tester;

/*
 * How to convert json to java object
 */
import java.io.File;

import model.Person;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJsonToJavaObj {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String jsonString = "{\"id\":101,\"name\":\"ravi\"}";
			// re construct java object from JSON string
			Person p = mapper.readValue(jsonString, Person.class);
			System.out.println(p);
			// re construct java object from JSON file
			Person p2 = mapper.readValue(new File("test1.json"), Person.class);
			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
