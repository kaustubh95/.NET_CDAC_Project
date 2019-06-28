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

public class TestJsonToJavaMap2 {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
		

			HashMap<String,Person> hm = new HashMap<>();
			// convert JSON string to map
			//1st arg --string
			//2nd arg -- TypeReference<T>
			hm = mapper.readValue(new File("test2.json"),
					new TypeReference<Map<String,Person>>() {
					});
			System.out.println(hm);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
