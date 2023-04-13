package april_13_23_lab;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        // Adding 10 Person objects to the ArrayList
        people.add(new Person("Gautam", 25));
        people.add(new Person("Sourav", 30));
        people.add(new Person("gourav", 42));
        people.add(new Person("Shweta", 18));
        people.add(new Person("MANISH", 50));
        people.add(new Person("Prince", 29));
        people.add(new Person("Hemant", 37));
        people.add(new Person("kripal", 23));
        people.add(new Person("Chauhan", 55));
        people.add(new Person("himanshu", 27));

        // Printing each Person object using for-each loop
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
