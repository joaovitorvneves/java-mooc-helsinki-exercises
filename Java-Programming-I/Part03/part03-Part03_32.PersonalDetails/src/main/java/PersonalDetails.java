
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        String longestName = "";
        
        while (true) {
            String text = scanner.nextLine();
            
            if (text.isEmpty()) {
                break;
            }
            
            String[] pieces = text.split(",");
            
            String name = pieces[0];
            if (longestName.length() < name.length()) {
                longestName = name;
            }
            
            int year = Integer.valueOf(pieces[1]);
            sum += year;
            count += 1;
        }
        
        System.out.println("Logest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) sum / count));
    }
}
