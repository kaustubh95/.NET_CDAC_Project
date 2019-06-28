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

public class TestJsonToJavaMap {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String jsonString = "{\"id\":101,\"name\":\"ravi\"}";

			HashMap<String, Object> hm = new HashMap<>();
			// convert JSON string to map
			//1st arg --string
			//2nd arg -- TypeReference<T>
			hm = mapper.readValue(jsonString,
					new TypeReference<Map<String, String>>() {
					});
			System.out.println(hm);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
