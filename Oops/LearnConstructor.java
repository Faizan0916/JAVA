package JAVA.Oops;

public class LearnConstructor {
    public static void main(String[] args) {
        Complex num1 = new Complex(6);
        Complex num2 = new Complex(4, 1);
        num1.Print();
        num2.Print();
        System.out.println("adding two numbers");
        Complex result = num1.add(num2);
        result.Print();
    }
}

class Complex {
    int a, b;

    public Complex(int real) {
        a = real;
        b = 5;
        this(real, 12);
    }

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }


    // public Complex(int real, int imaginary) {
    //     a = real;
    //     b = imaginary;
    // }

    void Print() {
        System.out.println(a + " + " + b + "i");
    }

    Complex add(Complex num2) {
        this.print();
        return new Complex(a+num2.a, b+num2.b);
    }
}
