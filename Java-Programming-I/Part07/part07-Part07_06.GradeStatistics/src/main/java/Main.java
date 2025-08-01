import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        UserInterface userInterface = new UserInterface(scanner);
        userInterface.start();
        
        Manager manager = new Manager(userInterface.getNotes());
        System.out.println(manager);
    }
}