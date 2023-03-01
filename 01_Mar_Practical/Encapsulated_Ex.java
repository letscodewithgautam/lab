package mypackage;

public class Encapsulated_Ex {
	public static void main(String[] args) {
		Persons p = new Persons();
		p.setName("GAUTAM");
		p.setAge(22);
		System.out.println("Name is: "+p.getName());
		System.out.println("Age is: "+p.getAge());
	}

}
