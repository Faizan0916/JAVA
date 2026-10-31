    package JAVA.Inheritance.Array;

    public class math {
        public static void main(String[] args) {
            int a = 2;
            int b = -1;

            System.out.println(Math.min(a, b));
            System.out.println(Math.sqrt(16));
            System.out.println(Math.abs(-4));
            System.out.println(Math.pow(3, 5));
            System.out.println(getRandom());
            System.out.println(Math.floor(5.9));
            System.out.println(Math.ceil(5.9));
            System.out.println(Math.round(5.8));
        }

        public static int getRandom() {
            return (int) (Math.random()*6) + 1;
        }
    }
