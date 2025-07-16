
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] pieces = line.split(",");
                
                String name = pieces[0];
                int age = Integer.valueOf(pieces[1]);
                
                System.out.print(name + ", age: ");
                if (age == 1) {
                    System.out.println(age + " year");
                } else {
                    System.out.println(age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
