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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int currentWeight = 0;
        
        for (Item _item : items) {
            currentWeight += _item.getWeight();
        }
        
        if (currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }
    
    public String toString() {
        int currentWeight = 0;
        
        for (Item item : items) {
            currentWeight += item.getWeight();
        }
        
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (items.size() == 1) {
            return "1 item (" + currentWeight + " kg)";
        }
        
        return items.size() + " items (" + currentWeight + " kg)";
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int currentWeight = 0;
        
        for (Item item : items) {
            currentWeight += item.getWeight();
        }
        
        return currentWeight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
