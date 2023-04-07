import java.util.Scanner;

public class Task1 {
  
    public static void task(){

        double a, b, c, x;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter parameters for the function");

        System.out.print("Enter a: ");
        a = in.nextDouble();
        System.out.print("Enter b: ");
        b = in.nextDouble();
        System.out.print("Enter c: ");
        c = in.nextDouble();
        System.out.print("Enter x: ");
        x = in.nextDouble();

        System.out.println("F = " + F1(a, b, c, x));

        System.out.println();
    }

    //Оператор if.
    static double F1(double a, double b, double c, double x){
      
        double F;
      
        if(c < 0 && b != 0){
            F = a * x * x + b * b * x;
        }else if(c > 0 && b == 0){
            F = (x + a)/(x + c);
        }else{
            F = x / c;
        }
      
        return F;
    
    }

}
