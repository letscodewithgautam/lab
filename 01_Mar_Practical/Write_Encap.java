package mypackage;

public class Write_Encap {
	private String name;
//
//	public String getName() {
//		return name;
//	}

	public void setName() {
		this.name = name;
	}
	public static void main(String[] args) {
		Write_Encap obj = new Write_Encap();
		obj.setName();
		System.out.println(obj.name);
	}

}
