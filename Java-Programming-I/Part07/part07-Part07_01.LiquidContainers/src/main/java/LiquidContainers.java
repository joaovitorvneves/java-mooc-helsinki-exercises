import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] pieces = input.split(" ");
            
            String command = pieces[0];
            int value = Integer.valueOf(pieces[1]);
            
            if (command.equals("add")) {
                if (value < 0) {
                    continue;
                }
                
                if (value + first > 100) {
                    first = 100;
                    continue;
                }
                
                first += value;
            }
            
            if (command.equals("move")) {
                if (first - value < 0) {
                    second += first;
                    first = 0;
                    continue;
                }
                
                first -= value;
                second += value;
                
                if (second > 100) {
                    second = 100;
                }
            }
            
            if (command.equals("remove")) {
                if (value > second) {
                    second = 0;
                    continue;
                }
                
                second -= value;
            }
        }
    }
}