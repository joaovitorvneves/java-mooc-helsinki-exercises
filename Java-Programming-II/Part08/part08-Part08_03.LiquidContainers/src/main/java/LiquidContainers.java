import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            
            String[] pieces = input.split(" ");

            if (input.equals("quit")) {
                break;
            }

            String command = pieces[0];
            int value = Integer.valueOf(pieces[1]);
            
            if (command.equals("add")) {
                if (value < 0) {
                    continue;
                }
                
                first += value;
                
                if (first > 100) {
                    first = 100;
                }
            }
            
            if (command.equals("move")) {
                if (value < 0) {
                    continue;
                }
                
                if (first > value) {
                    second += value;
                    first -= value;
                } else {
                    second += first;
                    first = 0;
                }

                if (second > 100) {
                    second = 100;
                }
            }
            
            if (command.equals("remove")) {
                if (value < 0) {
                    continue;
                }
                
                second -= value;
                
                if (second < 0) {
                    second = 0;
                }
            }
        }
    }
}