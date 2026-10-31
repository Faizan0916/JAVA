package JAVA;
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // boolean hasLearned = false;
        // while(!hasLearned) {
        //     System.out.println("Went to school and tried to learn");
        //     System.out.println("have you understand the concept");
        //     hasLearned = sc.nextBoolean();
        // }

        int i= 31;

        do {
            System.out.println(i);
            i++;
        } while(i <= 10);

        System.out.println("out of the loop");
    }   
}
