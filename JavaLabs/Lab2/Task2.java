import java.util.Scanner;

public class Task121 {
  
    // Write a programme that waits for the name of the month to be entered.
    // Depending on this, it determines the quarter.
  
    public static void task(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the full name of the month: ");
        String str = in.next();

        if (F121(str) != -1){
            System.out.println(str + " is " + F121(str) + "-й quarter!");
        } else {
            System.out.print("There is no such month!");
        }

        System.out.println();
      
    }

    static int F121(String str) {

        int Q;
      
        switch (str.toLowerCase()) {
            
            case "january":
            case "february":
            case "march":
                Q = 1;
                break;
            
            case "april":
            case "may":
            case "june":
                Q = 2;
                break;
            
            case "jule":
            case "august":
            case "september":
                Q = 3;
                break;
            
            case "october":
            case "november":
            case "december":
                Q = 4;
                break;
            
            default:
                Q = -1;
                break;
            
        }
      
        return Q;
      
    }
  
}
