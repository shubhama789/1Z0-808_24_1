package q83;

import java.util.ArrayList;

public class InfiniteWhileException {

	public static void main(String[] args) {
		ArrayList mylist = new ArrayList();
		String[] myArray;
		try {
			while (true) {
				mylist.add("My String");
			}
		}
		catch (RuntimeException e) {
			System.out.println("Caught a Runtime Exception");
		}
		catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}
}
