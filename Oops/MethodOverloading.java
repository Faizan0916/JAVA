package JAVA.Oops;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greeting("faizan", 7);
    }
}

class Greet {
    void greetings() {
        System.out.println("Hello, Good Morning!");
    }

    void greeting(String name, int count) {
        for(int i=0; i<count; i++) {
        System.out.println("Hello "+name+", Good-Morning!");
        }
    }
}