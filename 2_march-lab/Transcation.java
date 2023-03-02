package mar_02_23;

public class Transcation {
	public static void main(String[] args) {
		Bank B = new Bank();  // call main bank method
		// user 1 details
		B.setAccount_Number(987654123456789l);
		B.setAccount_Name("GAUTAM");
		B.setAccount_Balance(25000.0);
		B.setWithdraw(2500.0);
		
		System.out.println("Account Number: "+B.getAccount_Number());
		System.out.println("Account Holder Name: "+B.getAccount_Name());
		System.out.println("Account Balance: "+B.getAccount_Balance());
		System.out.println("Withdraw Amount: "+B.getWithdraw());
		
		System.out.println(); // for space between both user in print output
		// user2 details
		B.setAccount_Number(5863921475245547l);
		B.setAccount_Name("MANISH");
		B.setAccount_Balance(20000.0);
		B.setWithdraw(2000.0);
		
		System.out.println("Account Number: "+B.getAccount_Name());
		System.out.println("Account Holder Name: "+B.getAccount_Number());
		System.out.println("Account Balance: "+B.getAccount_Balance());
		System.out.println("Withdraw Amount: "+B.getWithdraw());
		
	}
}
