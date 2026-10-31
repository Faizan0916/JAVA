package JAVA.Inheritance.Array;

public class Array {
    public static void main(String[] args) {
        // int age[];  // declaration of array

        // age = new int[5];  // allocation of array

        // int age[] = new int[5];  // declaration and allocation of array 

        // age[0] = 5;
        // age[1] = 23;

        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);   
        // System.out.println(age.length);

        String names[] = {"john", "doe", " smith", "jane" };
        for(int i=0; i<names.length; i++) {
            System.out.println("Name is "+ names[i]);
        }

        for(String name : names) {
            System.out.println("for each name is "+name);
        }
    }
}
