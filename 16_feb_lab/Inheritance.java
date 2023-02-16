package feb_16_lab;
class Arithmetic
{
     int add(int a,int b)
    {
        return a+b;
    }
}
 class Adder extends Arithmetic {}
public class Inheritance{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("Sum of a and b: " );    
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(4,3) + "\n");
        System.out.print(a.add(10,3) + "\n");
     }
}



