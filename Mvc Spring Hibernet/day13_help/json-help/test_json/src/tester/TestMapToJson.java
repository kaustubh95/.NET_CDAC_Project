package tester;

/*
 * How to convert json to java object
 */
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import model.Person;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMapToJson {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			HashMap<Integer, Person> persons = new HashMap<>();
			persons.put(101, new Person(101, "aa"));
			persons.put(102, new Person(102, "bb"));

			mapper.writerWithDefaultPrettyPrinter().writeValue(
					new File("test2.json"), persons);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
