package mar_02_23;

public class Main {
	public static void main(String[] args) {
		Library obj = new Library(); //create object
		obj.setBookId(2023);
		obj.setBookName("Storm Watch");
		obj.setBookAuthor("C.J.Box");
		//print the line
		System.out.println("The Book Name is :"+obj.getBookName());
		System.out.println("The Book Id is :"+obj.getBookId());
		System.out.println("The Book Author Name is :"+obj.getBookAuthor());
	}
}
