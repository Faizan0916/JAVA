package Oops4

public class LearnAnonymousClass {
    // class InnerClass extends outerClass {}

    outerClass obj = new outerClass() {
        
        void sing() {
        }

        public void outerMethod() {
        }
    };

    SuperInterface obj2 = new SuperInterface() {

        @Override 
        public void InterfaceMethod () {
        }
    };

    SuperInterface obj3 = () -> {

    };

    public static void main(String[] args) {
        Walkable walkAble = (int steps) -> {

            System.out.println("Walked "+steps+" steps");
            return steps;
        };
        walkAble.walks(5);

        walkAble obj2 = (int steps) -> 2*steps;

        System.out.println(obj2.walks());
    }
 
}

interface Walkable {

    int walks(int steps);
}

class outerClass {
    public void outerMethod () {

    }
}

@FunctionalInterface  // Only allow for one method
interface SuperInterface{
    
    void interfaceMethod();
}

