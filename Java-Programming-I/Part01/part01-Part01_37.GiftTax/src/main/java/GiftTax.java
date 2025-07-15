
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        
        int value = Integer.valueOf(scan.nextLine());
        
        if (value >= 1000000) {
            System.out.println("Tax: " + (142100 + 0.17 * (value - 1000000)));
        } else if (value >= 200000) {
            System.out.println("Tax: " + (22100 + 0.15 * (value - 200000)));
        } else if (value >= 55000) {
            System.out.println("Tax: " + (4700 + 0.12 * (value - 55000)));
        } else if (value >= 25000) {
            System.out.println("Tax: " + (1700 + 0.10 * (value - 25000)));
        } else if (value >= 5000) {
            System.out.println("Tax: " + (100 + 0.08 * (value - 5000)));
        } else {
            System.out.println("No tax!");
        }
    }
}
