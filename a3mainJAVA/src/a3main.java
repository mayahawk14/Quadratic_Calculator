import java.util.Scanner;
import java.lang.Math;

public class a3main {


    static void mathIt(int a, int b, int c, double square, boolean oneSol) {
        double rs = -b + square;
        double denom = 2*a;
        double first = rs/denom;


        //x2
        double rs2 = -b - square;
        double denom2 = 2*a;
        double second = rs2/denom2;

        if (oneSol == true){
            System.out.print(first);
        }
        else {
            System.out.print(first);
            System.out.println(", " + second);
        }

    }
    static void aEqul0(int a, int b, int c) {
        int x = -c/b;
        System.out.println("One real solution");
        System.out.println(x);
    }

    static void CALCULATE (int a, int b, int c) {
        double discriminant = Math.pow(b,2) - 4*a*c;
        double square = 0;
        boolean oneSol = true;
        if (discriminant < 0) {
            System.out.println("Two distinct complex solutions");
            square = Math.sqrt(Math.abs(discriminant));
            double front = -b/2 * a;

            String first = "(" + front + " + " + square + "i" + ")";
            String second = "(" + front + " - " + square + "i" + ")";

            System.out.println(first);
            System.out.print(", " + second);
            System.exit(0);

        }
        else if (discriminant == 0) {
            System.out.println("One real solution");
            oneSol = true;
        }
        else{
            System.out.println("Two real solutions");
            oneSol = false;
        }
        square = Math.sqrt(Math.abs(discriminant));
        mathIt(a,b,c,square,oneSol);


    }


    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        // Create reader object
        System.out.println("Enter A, B, and C values: ");

        int a = values.nextInt();
        // Read user input

        int b = values.nextInt();

        int c = values.nextInt();

        if (a == 0) {
            aEqul0(a, b, c);
        }
        else {
            CALCULATE(a, b, c);
        }
    }
}