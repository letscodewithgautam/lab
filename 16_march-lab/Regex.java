package march_16_23;

import java.util.regex.Pattern;
class Regex {
	public static void main(String[] args) {
		// input 1
		boolean b1 = Pattern.matches("[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}", "000.12.12.034");
		System.out.println(b1);
		// input 2
		boolean b2 = Pattern.matches("[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}", "121.234.12.12");
		System.out.println(b2);
		// input 3
		boolean b3 = Pattern.matches("[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}", "23.45.12.56");
		System.out.println(b2);
		// input 4
		boolean b4 = Pattern.matches("[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}", "00.12.123.123123.123");
		System.out.println(b4);
		// input 5
		boolean b5 = Pattern.matches("[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}", "122.23");
		System.out.println(b5);
		// input 6
		boolean b6 = Pattern.matches("[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}+\\.[0-9]{2,3}", "Hello.IP");
		System.out.println(b6);
	}
}
