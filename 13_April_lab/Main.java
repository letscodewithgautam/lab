package april_13_23_lab;

public class Main {
	public static void main(String[] args) {
        OddNumbers oddNumbers = new OddNumbers();
        oddNumbers.storeOddNumbers(10);
        oddNumbers.printOddNumbers();
        int num = oddNumbers.retrieveOddNumber(6);
        System.out.println("Number retrieved: " + num);
	}
}
