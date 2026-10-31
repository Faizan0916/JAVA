package JAVA.Oops;

import javax.swing.plaf.synth.SynthStyle;

public class mainClass {

    public static void main(String[] args) {
        // Dog d1 = new Dog();
        // d1.name = "tommy";
        // d1.Bark();

        // Dog d2 = new Dog();
        // d2.name = "Lea";
        // d2.walk();

        Complex num1 = new Complex();
        num1.a = 5;
        num1.b = 7;
        num1.print();
    }   
}

class Complex{
    int a, b;
    
    void print() 
    {
        System.out.println(a+" + "+b+"i");
    }
}


class Dog { //factory
    String name;
    int age;
    String color;

    void walk() {
        System.out.println("Dog is walking");
    }

    void Bark() {
        System.out.println("Dog is Barking");
    }
}