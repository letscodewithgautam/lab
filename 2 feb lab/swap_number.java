package feb_2_23;

public class swap_number {
public static void main(String[] args) {
	
	int x = 2;  // first number
	int y = 5;  // second number
	
	System.out.println("x: " + x +", y: " + y);
	int temp = x;
	x=y;
	y = temp;
	System.out.println("x and y after swapping: " + "x: " + x +", y: " + y);
}
}
