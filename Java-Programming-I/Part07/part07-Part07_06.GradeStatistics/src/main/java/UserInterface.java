/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Integer> notes;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        notes = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter totals, -1 stops:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == - 1) {
                break;
            }
            
            if (input < 0 || input > 100) {
                continue;
            }
            
            notes.add(input);
        }
    }
    
    public ArrayList<Integer> getNotes() {
        return notes;
    }
}