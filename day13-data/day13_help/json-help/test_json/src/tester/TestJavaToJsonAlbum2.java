package tester;

/*
 * How to convert java object with different data types to json
 */
import java.io.File;
import java.sql.Date;
import java.util.Arrays;

import model2.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJavaToJsonAlbum2 {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			Album a1 = new Album("cold play", "Death",
					new String[] { "link1,link2" }, Arrays.asList("song1",
							"song2", "song3"));
			a1.setArtist(new Artist("John",Date.valueOf("1998-1-1")));
			
		
			// formatted json
			mapper.writerWithDefaultPrettyPrinter().writeValue(
					new File("album3.json"), a1);
			System.out.println("main over...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
