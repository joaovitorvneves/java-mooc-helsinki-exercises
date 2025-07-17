/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");     
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye !");
                return;
            }
            
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                        
                dict.add(word, translation);
            }

            if (command.equals("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                
                String translation = dict.translate(word);
                
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            }
            
            System.out.println("Unknown command");
        }
    }
}
