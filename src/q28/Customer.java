package q28;

public class Customer {

	ElectricAccount acct = new ElectricAccount();
	
	public void useElectricity(double kwh) {
		acct.addKwh(kwh);
	
	}
}
