import java.util.Scanner;

public class Task2 {
  
    public static void task(){
      
        double a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculate the length of the hypotenuse of a right triangle, knowing the lengths of the two cathetuses");

        System.out.print("Enter the length of the first cathetus: ");
        a = in.nextDouble();
        System.out.print("Enter the length of the second cathetus: ");
        b = in.nextDouble();

        Hypotenuse(a, b);

        System.out.println();
    }
    static void Hypotenuse(double a, double b){

        double c = Math.sqrt(a * a + b * b);
        System.out.println("The hippotenuse of a right triangle with the cathetuses " + a + " and " + b + " is " + c);

    }
}
