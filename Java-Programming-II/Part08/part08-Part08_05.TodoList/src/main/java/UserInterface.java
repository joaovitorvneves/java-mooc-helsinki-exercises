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
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
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
                System.out.println("To add");
                
                todoList.add(scanner.nextLine());
            }
            
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                
                todoList.remove(Integer.valueOf(scanner.nextLine()));
            }
            
            if (command.equals("list")) {
                todoList.print();
            }
        }
    }
}
