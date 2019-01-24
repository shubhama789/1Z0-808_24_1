package q29;

import java.util.ArrayList;
import java.util.List;

public class ArrayRemove {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		if(names.remove("Bran")) {
			names.remove("Jon");
		}
		System.out.println(names);
		
		
		String b=names.remove(3);	//// size is 2 and trying to access index 3
		System.out.println(b);
		System.out.println(names);
	}
}
