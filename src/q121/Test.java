package q121;

public class Test {

	public static void main(String[] args) {
		
		//Employee e1 = new Employee();						 constructor without parameter is not defined 
		Employee e2 = new Employee("Jack",50);
		Employee e3 = new Employee("Chloe",40,5000);
		e2.printdetails();
		e3.printdetails();
	}
}
