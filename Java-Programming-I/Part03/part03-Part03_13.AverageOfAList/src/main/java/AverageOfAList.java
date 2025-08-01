
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            numbers.add(number);
        }
        
        for (int n : numbers) {
            sum += n;
        }
        
        System.out.println("Average: " + ((double) sum / numbers.size()));
    }
}
