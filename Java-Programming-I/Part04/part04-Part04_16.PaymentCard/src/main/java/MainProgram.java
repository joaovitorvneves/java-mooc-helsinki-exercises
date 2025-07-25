
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");
        
        paulsCard.addMoney(20);
        
        mattsCard.eatHeartily();
        
        System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        
        mattsCard.addMoney(50);
        
        System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");
    }
}
