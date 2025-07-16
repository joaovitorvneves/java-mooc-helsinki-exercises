/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void eatAffordably() {
    // write code here
        if (balance >= 2.60) {
            balance -= 2.60;
        }
    }

    public void eatHeartily() {
    // write code here
        if (balance >= 4.60) {
            balance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
    // write code here
        if (amount > 0) {
            balance += amount;
        }
        
        if (balance > 150) {
            balance = 150;
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
