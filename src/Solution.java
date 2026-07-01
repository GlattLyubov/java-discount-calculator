import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n=== Discount Calculator ===\n");

        System.out.print("Enter the product name: ");
        String product = input.nextLine();

        System.out.print("\nEnter the original price: ");
        double originalPrice = input.nextDouble();

        System.out.print("\nEnter the discount (%): ");
        double valueDiscount = input.nextDouble();

        if (originalPrice <= 0) {
            System.out.println("\nThe product value cannot be less than or equal to zero.\n");
            input.close();
            return;
        }
        else if (valueDiscount <= 0) {
            System.out.println("\nThe discount amount cannot be less than or equal to zero.\n");
            input.close();
            return;
        }

        double discount = originalPrice * (valueDiscount / 100);
        double finalValue = originalPrice - discount;

        System.out.println("\n======= Product ==========");
        System.out.printf("Product: %s\n", product);
        System.out.printf("Original Price: R$ %.2f\n", originalPrice);
        System.out.printf("Discount: %.0f%%%n", valueDiscount);
        System.out.printf("Discount Value: R$ %.2f\n", discount);
        System.out.printf("Final Price: R$ %.2f", finalValue);
        System.out.println("\n=========================\n");




        input.close();
    }
}
