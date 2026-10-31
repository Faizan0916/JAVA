package JAVA.Inheritance.Array;

public class method {
    public static void main(String[] args) {
        greet();

        float averageOffunction = average(6, 43, false);
        float doubleOfavg = averageOffunction * 2;

        System.out.println(doubleOfavg);

    }

    static void greet() {
        System.out.println("Hello babeee");
    }
    
    public static float average(float a, float b, boolean shouldAverage) {
        if(shouldAverage == false) {
            return -1;
        }
        float avg = (a + b)/2;
        System.out.println("The average is "+avg);
        return avg;
    }
}
