package JAVA;
import java.util.Scanner;

public class LearnSwithch {
    public static void main(String[] args) {

        // int a = 22;
        // int b = 32;
        // int c = 5;

        // if(a > b && a > c) {
        //     System.out.println("a is the largest number");
        // }
        // else if(b > a && b > c) {
        //     System.out.println("b is the largest number");
        // } else {
        //     System.out.println("c is the largest number");
        // }

        // int maxi = 0;

        // max= a>b ? a>c ? a : c : b>c ? b : c;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day : ");
        int day = sc.nextInt();

        switch(day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("today is Tuesdayy");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("today is Thursday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("Today is saturday");
                break;
        }

    }
}