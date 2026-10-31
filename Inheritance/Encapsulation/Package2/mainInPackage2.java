package JAVA.Inheritance.Encapsulation.Package2;

import JAVA.Inheritance.Encapsulation.LearnPackage1.Teacher;

public class mainInPackage2 extends Teacher {


    public static void main(String[] args) {
        Teacher obj = new Teacher();
        // obj.id = 12;
        obj.teachingClass = 4;
        obj.degree = "PHD";

        mainInPackage2 MainInpackage2 = new mainInPackage2();

        mainInPackage2.studentCount = 100;

    }
}
