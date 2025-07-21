import java.util.Scanner;

public class LiquidContainers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            
            String[] pieces = input.split(" ");

            if (input.equals("quit")) {
                break;
            }

            String command = pieces[0];
            int value = Integer.valueOf(pieces[1]);
            
            if (command.equals("add")) {
                first.add(value);
            }
            
            if (command.equals("move")) {
                second.add(Math.min(first.contains(), value));
                first.remove(value);
            }
            
            if (command.equals("remove")) {
                second.remove(value);
            }
        }
    }
}