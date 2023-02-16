package feb_16_lab;
// Multi level inheritance
class A {
    public void print_ClassA()
    {
        System.out.println("Class A");
    }
}
class B extends A {
    public void print_ClassB() {
    	System.out.println("Class B");
    	}
}
class C extends B {
    public void print_ClassC()
    {
        System.out.println("Class C");
    }
}
// Drived class
public class main {
    public static void main(String[] args)
    {
        C s = new C();
        s.print_ClassA();
        s.print_ClassB();
        s.print_ClassC();
    }
}


