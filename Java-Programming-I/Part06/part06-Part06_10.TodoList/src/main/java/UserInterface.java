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

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                return;
            }
            
            if (command.equals("add")) {
                System.out.println("To add:");
                
                list.add(scanner.nextLine());
            }
            
            if (command.equals("list")) {
                list.print();
            }
            
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                
                list.remove(Integer.valueOf(scanner.nextLine()));
            }
        }
    }
}
