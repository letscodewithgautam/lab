package feb_9_assigment;
import java.util.Scanner;

public class smallest_number {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);

		 System.out.print("Enter First number: ");
       int n1 = in.nextInt();
       System.out.print("Enter Second number: ");
       int n2 = in.nextInt();
       System.out.print("Enter Third number: ");
       int n3 = in.nextInt();
       // using else if statement
       if (n1<n2 && n1<n3) {
    	   System.out.println(n1+" is smallet number");
       }
       else if (n2<n3 && n2<n1) {
    	   System.out.println(n2+" is smallet number");
       }
       else if (n3<n2 && n3<n1) {
    	   System.out.println(n3+" is smallet number");
       }

}
}