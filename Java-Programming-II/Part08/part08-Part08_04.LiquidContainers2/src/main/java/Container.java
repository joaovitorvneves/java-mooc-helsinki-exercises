/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }
  
    public int contains() {
        return amount;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.amount += amount;
        
        if (this.amount > 100) {
            this.amount = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.amount -= amount;
        
        if (this.amount < 0) {
            this.amount = 0;
        }
    }
    
    public String toString() {
        return amount + "/100";
    }
}