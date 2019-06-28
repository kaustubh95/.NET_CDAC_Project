package tester;

import java.util.HashMap;
import java.util.HashSet;

import custom_key.Key;

public class TestHashMap {

	public static void main(String[] args) {

		/*HashMap<Key, Integer> hm = new HashMap<>();
		hm.put(new Key("John Smith"), 123);
		hm.put(new Key("Sandra Dee"), 126);
	//	System.out.println(hm); --if i un comment this, hascode gets called here also
		
		 * HashSet<Key> hs = new HashSet<>(); hs.add(new Key("abc"));
		 */
		
		HashMap<Key,Integer> hm=new HashMap<>();
		hm.put(new Key(1, "aa"), 100);
		hm.put(new Key(1, "ab"), 200);
		hm.put(new Key(2, "aa"), 200);
		System.out.println("printing HM");
		System.out.println(hm);

	}

}
