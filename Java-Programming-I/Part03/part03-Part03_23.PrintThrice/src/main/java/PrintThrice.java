
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        
        String text = scanner.nextLine();
        
        System.out.println(text + text + text);
    }
}
