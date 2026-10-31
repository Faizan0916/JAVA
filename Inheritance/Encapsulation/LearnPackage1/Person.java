package JAVA.Inheritance.Encapsulation.LearnPackage1;

public class Person {

        public static int count = 0; // ek hi bar bnega and sab object se access ho jayega 


        public Person() {
            count++;
        }

        private int age;

        // private String name;

        boolean canBeChanged = true;

        public void setAge(int age ) {
            if(canBeChanged) {
                if(age > 0) {
                    this.age = age; 
                }
            }
        }

        boolean canBeAccessed = true;

        public int getAge() {
            if(canBeAccessed) return age;
            return -1;
        }   
}
