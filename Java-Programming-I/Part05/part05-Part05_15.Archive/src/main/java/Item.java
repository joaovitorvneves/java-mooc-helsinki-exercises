/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Item {
    private String name;
    private String identifier;

    public Item(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    
    public String toString() {
        return identifier + ": " + name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item _compared = (Item) compared;
        
        return this.identifier.equals(_compared.identifier);
    }
}
