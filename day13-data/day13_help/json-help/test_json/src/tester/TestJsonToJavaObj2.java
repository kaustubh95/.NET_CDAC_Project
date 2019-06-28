package tester;

/*
 * How to convert json to java object
 */
import java.io.File;

import model.Person;
import model2.Album;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJsonToJavaObj2 {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
				// re construct java object album  from JSON file
			Album album = mapper.readValue(new File("album3.json"), Album.class);
			System.out.println(album);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
