import java.util.Scanner;

public class Main3 {
    public static void main3(){
        double x;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculate  y = x ^ 2 - sin(x) + cos(x)");
      
        System.out.print("Enter x: ");
        x = in.nextDouble();

        F(x);

        System.out.println();
    }
  
    static void F(double x){

        double y = x * x + Math.sin(x) + Math.cos(x);
        System.out.println("y = " + y);

    }
}
