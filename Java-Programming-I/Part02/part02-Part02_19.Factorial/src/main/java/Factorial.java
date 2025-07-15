
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        
        int factorial = 1;
        
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number < 0) {
            return;
        }
        
        if (number > 0) {
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }    
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
