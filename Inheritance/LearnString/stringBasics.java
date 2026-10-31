package JAVA.Inheritance.LearnString;

public class stringBasics {
    public static void main(Learnstring[] args) {
        Learnstring name = "faizan";
        Learnstring sameName = "faizan";
        Learnstring newName = new Learnstring("FAIZAN");

        System.out.println(name);
        System.out.println(sameName);
        System.out.println(newName);

        // if(name == sameName) {
        //     System.out.println("both are same");
        // }

        // if(name == newName) {
        //     System.out.println("both are same"); 
        // } else {
        //     System.out.println("both are not same");
        // }
        // System.out.println("faizan ahmad ansari");

        if(name.equals(newName)) {
            System.out.println("name and newName both are the same value");
        } else {
            System.out.println("not same"); 
        }

        if(name.equalsIgnoreCase(newName)) {
            System.out.println("both are same volue no matter the case"); 
        } else {
            System.out.println("both are not same valuee");
        }
    }
}
