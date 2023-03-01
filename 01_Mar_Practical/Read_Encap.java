package mypackage;
// we can read only ( only getter method)
public class Read_Encap {
	private String name = "Gautam";
	// getting the name
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Read_Encap obj = new Read_Encap();
		// obj.set_name("Shifa");  // we can't change the value of the name
		System.out.println(obj.name);
	}
}
