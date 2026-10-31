package JAVA.Inheritance.LearnString;

import java.util.Scanner;

public class Learnstring {
    public static void main(String[] args) {

        // String name = "fAiZaN32";
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.trim());
        // System.out.println("Carpet".startsWith("carp1"));
        // System.out.println("Carpet".endsWith("pet"));
        // System.out.println("Carpet".equals("Carpet"));
        // char temp = "Carpet".charAt(4);
        // System.out.println(temp);

        // int age = 123;
        // String stringAge = String.valueOf(age);
        // System.out.println(age+2);
        // System.out.println(stringAge+2);

        // String sentence = "I love Java, Java is good language";
        // String newsentence = sentence.replace("Java", "cpp");

        // System.out.println(sentence);
        // System.out.println(newsentence);

        String color = "brown";
        char letters[] = color.toCharArray();

        for(char letter: letters) {
            System.out.println(letter);
        }

        String animal = "    ";
        if(animal.isEmpty()) {
            System.out.println("empty");
        } else if(animal.isBlank()) {
            System.out.println("Blank");
        }


        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your first Name : ");
        // String firstName = sc.nextLine();

        // System.out.println("Enter your Last Name : ");
        // String lastName = sc.nextLine();

        // System.out.println("Your full name is : " + firstName + " " + lastName);
        // sc.close();
    }
}
