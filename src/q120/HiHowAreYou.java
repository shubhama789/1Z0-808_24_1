package q120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiHowAreYou {


	public static void main(String[] args) {
		
		String[] arr = {"Hi","How","Are","You"};
		List<String> arrlist = new ArrayList<>(Arrays.asList(arr));
		if(arrlist.removeIf((String s)->{return s.length()<=2; })) {
			System.out.println(" removed");					/////    Compilation error if s is present there
			
		}
	}
}
