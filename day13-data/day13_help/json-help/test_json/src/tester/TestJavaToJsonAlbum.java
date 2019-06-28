package tester;

/*
 * How to convert java object with different data types to json
 */
import java.io.File;
import java.util.Arrays;

import model.Album;
import model.Person;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJavaToJsonAlbum {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Album a1 = new Album("cold play", "Death",
					new String[] { "link1,link2" }, Arrays.asList("song1",
							"song2", "song3"));
			mapper.writeValue(new File("album1.json"), a1);
			// formatted json
			mapper.writerWithDefaultPrettyPrinter().writeValue(
					new File("album2.json"), a1);
			System.out.println("main over...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
