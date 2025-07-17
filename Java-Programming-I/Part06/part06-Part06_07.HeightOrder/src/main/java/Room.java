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

public class Room {
    private ArrayList<Person> people;

    public Room() {
        people = new ArrayList<>();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public boolean isEmpty() {
        return people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = people.get(0);
        
        for (int i = 1; i < people.size(); ++i) {
            if (people.get(i).getHeight() < shortest.getHeight()) {
                shortest = people.get(i);
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        
        people.remove(shortest);
        
        return shortest;
    }
}
