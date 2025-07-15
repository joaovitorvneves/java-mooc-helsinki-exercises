
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String nameOldest = "";
        
        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("")) {
                break;
            }
            
            String[] pieces = text.split(",");
            
            String name = pieces[0];
            int age = Integer.valueOf(pieces[1]);
            
            if (oldest < age) {
                oldest = age;
                nameOldest = name;
            }
        }
        
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
