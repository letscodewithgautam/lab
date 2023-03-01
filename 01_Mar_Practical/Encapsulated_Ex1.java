package mypackage;

public class Encapsulated_Ex1 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setAccount_num(987654321987654l);
		b.setName("GAUTAM");
		b.setE_mail("gautamchaudhary4649@gmail.com");
		b.setAmount(25000f);
		
		System.out.println(b.getAccount_num()+ " " +b.getName()+ " " +b.getE_mail()+ " " +b.getAmount());
	}

}
