package feb_23_lab;

class Banks {  // parent class
	float Intrest() {  // Intrest is a method of parent
		return 0;
	}
}
class SBI extends Banks {  // child class 1 
	float Intrest() {  // 
		return 8;  // 8 is 8% Intrest rate
	}
}
class ICICI extends Banks {  // child class 2 
	float Intrest() {
		return 7;
	}
}
class AXIS extends Banks {  // child class 3
	float Intrest() {
		return 9;
	}
}
public class Bank {
	public static void main(String[] args) {
		Banks banks;
		banks = new SBI();
		System.out.println(banks.Intrest());
		banks = new ICICI();
		System.out.println(banks.Intrest());
		banks = new AXIS();
		System.out.println(banks.Intrest());
		
	}
}
