package JAVA.Inheritance;

public class Vehicle {
    final int gears = 0;
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
        // v1.gears = 6;  cannot assigned 
    }

    int wheelsCount;

    String model;


    Vehicle() {
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelCount) {
        this.wheelsCount = wheelCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start() {
        System.out.println("Vehicle is Starting");
    }

    void accelerate() {
        System.out.println("Vehicle is acelarating");
    }
}
