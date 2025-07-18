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

public class BirdDatabase {
    private ArrayList<Bird> birds;

    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        
        if (!(birds.contains(newBird))) {
            birds.add(newBird);
        }
    }
    
    public void observation(Bird bird) {
        if (birds.contains(bird)) {
            bird.observe();
        } else {
            System.out.println("Not a bird!");
        }
    }
    
    public Bird findByName(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.getName())) {
                return bird;
            }
        }
        
        return null; // não encontrado
    }
    
    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public ArrayList<Bird> getBirds() {
        return this.birds;
    }
}
