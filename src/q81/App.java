package q81;

public class App {

	static int count;		/////// here if static is removed it will throw error that we can't make static reference to non-static field
	
	public static void displayMsg() {
		count++;
		System.out.println("Welcome"+"visit count: "+count);
	}
	
	public static void main(String[] args) {
		App a = new App();
		displayMsg();
		App.displayMsg();
		a.displayMsg();
	}
}
