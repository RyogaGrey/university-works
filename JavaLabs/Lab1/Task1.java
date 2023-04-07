import java.util.Scanner;

public class Task1 {
  
    public static void task(){
        double a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Given the values a and b, find their arithmetic mean, geometric mean");

        System.out.print("Enter the value a: ");
        a = in.nextDouble();
        System.out.print("Enter the value b: ");
        b = in.nextDouble();

        AMGM(a, b);

        System.out.println();
    }
  
    static void AMGM(double a, double b){

        double AM = (a + b) / 2;
        double GM = Math.sqrt(a * b);
        System.out.println("The arithmetic mean of " + a + " and " + b + " is " + AM);
        System.out.println("The geometric mean of " + a + " and " + b + " is " + GM);

    }
}
