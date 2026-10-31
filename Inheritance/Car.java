package JAVA.Inheritance;

public class Car extends Vehicle{

    String color;
        
    void start() {
        super.start();
        System.out.println(this);
        System.out.println(this.model+" Car is Starting");
    }

    Car() {
        super(4);
        System.out.println("Car is being created");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount = 4;
        obj.model = "I20 ";
        obj.color = "Red";
        obj.start();
        System.out.println(obj.wheelsCount);    
    }
}
