package JAVA.Inheritance.Encapsulation.learnEncapsulation;

import JAVA.Inheritance.Encapsulation.LearnPackage1.Person;

public class MainInEncapsulation {  
    
    // public static void main(String[] args) {

    //     Person p1 = new Person();
    //     p1.setAge(-3);
    //     System.out.println(p1.getAge());

    //     Person.count = 340;

    //     Person p2 = new Person();
        
    //     System.out.println(Person.count);
    // }

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAge(12);

        Person p2 = new Person();
        // Person p3 = new Person();

        System.out.println(Person.count);

    }
    
}
