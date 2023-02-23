package feb_23_lab;

class Employees {  // parent class
	float IncrementSalary() {  // IncrementSalary is a method of parent class
		return 0;
	}
}
class Developer extends Employees {  // child class 1 
	float IncrementSalary() {  // same name method as per parent
		return 0;
	}
}
class Manager extends Employees {  // child class 2 
	float IncrementSalary() {
		return 0;
	}
}
public class Employee {
	public static void main(String[] args) {
		Employees employees;
		employees = new Developer();
		System.out.println(employees.IncrementSalary());
		employees = new Manager();
		System.out.println(employees.IncrementSalary());	
	}
}
