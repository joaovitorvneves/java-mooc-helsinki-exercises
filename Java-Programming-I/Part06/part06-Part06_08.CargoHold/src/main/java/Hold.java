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

public class Hold {
    private ArrayList<Suitcase> items;
    private int maxWeight;

    public Hold(int maxWeight) {
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        
        for (Suitcase suit : items) {
            currentWeight += suit.totalWeight();
        }
        
        if (currentWeight + suitcase.totalWeight() <= maxWeight) {
            items.add(suitcase);
        }
    }
    
    public String toString() {
        int currentWeight = 0;
        
        for (Suitcase suit : items) {
            currentWeight += suit.totalWeight();
        }
        
        return items.size() + " suitcases (" + currentWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suit : items) {
            suit.printItems();
        }
    }
}
