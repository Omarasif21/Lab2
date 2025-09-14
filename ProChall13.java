/**

 * @author Omar Asif
 * @version 1.0
 * @since 2025-09-15
 */
import java.util.Scanner;

public class ProChall13 {
    public static void main(String[] args) {
        final double TAX_RATE = 0.0675;
        final double TIP_RATE = 0.20;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter meal amount: $");
        double meal = sc.nextDouble();

        double tax = meal * TAX_RATE;
        double tip = (meal + tax) * TIP_RATE;
        double total = meal + tax + tip;

        System.out.println("\nThe tax is: $" + tax);
        System.out.println("The tip is: $" + tip);
        System.out.println("The meal cost with tax and tip is: $" + total);

        sc.close();
    }
}
