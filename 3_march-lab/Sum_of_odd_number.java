package mar_03_23;
//Java Program to Calculate Sum of Odd Numbers using for loop
import java.util.Scanner;

public class Sum_of_odd_number {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i, oddSum = 0;
		sc = new Scanner(System.in);
		
		System.out.print("Please Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
			}
		}
		System.out.println("The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	}
}
