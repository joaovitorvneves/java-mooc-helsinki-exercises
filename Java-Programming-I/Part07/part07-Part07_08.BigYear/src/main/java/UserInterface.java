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
    private Scanner scan;
    private BirdDatabase birdDatabase;

    public UserInterface(Scanner scan, BirdDatabase birdDatabase) {
        this.scan = scan;
        this.birdDatabase = birdDatabase;
    }
    
    public void start() {
        while (true) {
            System.out.println("?");
            
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                return;
            }
            
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                
                System.out.println("Name in Latin:");
                String nameInLatin = scan.nextLine();
                
                birdDatabase.add(name, nameInLatin);
            }
            
            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                
                if (birdDatabase.getBirds().contains(birdDatabase.findByName(bird))) {
                    birdDatabase.findByName(bird).observe();
                } else {
                    System.out.println("Not a bird!");
                }
            }
            
            if (command.equals("All")) {
                for (Bird bird : birdDatabase.getBirds()) {
                    System.out.println(bird);
                }
            }
            
            if (command.equals("One")) {
                System.out.println("Bird?");
                
                String bird = scan.nextLine();
                
                System.out.println(birdDatabase.findByName(bird));
            }
        }
    }
}
