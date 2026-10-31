package JAVA.Oops4;

public class LearnInterfaces {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings(); 
    }
    
}

interface Pet {
    void sings();

    // void drinks();
}

interface Animal {
    void eats();

    void drinks();

    default void walk() {
        System.out.println("Animal is walking :"); 
    }
}

class Monkey implements Animal, Pet {

    public void eats () {
        System.out.println("Monkey is eating ");    
    }

    public void sings() {
        System.out.println("Monkey is singing");
    }
}