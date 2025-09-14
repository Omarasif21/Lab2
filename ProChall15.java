/**

 * @author Omar Asif
 * @version 1.0
 * @since 2025-09-15
 */
import java.util.Scanner;

public class ProChall15 {
    public static void main(String[] args) {
        final double COMMISSION_RATE = 0.02;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of shares: ");
        int shares = sc.nextInt();

        System.out.print("Enter price per share: ");
        double pricePerShare = sc.nextDouble();

        double stockCost = shares * pricePerShare;
        double commission = stockCost * COMMISSION_RATE;
        double total = stockCost + commission;

        System.out.println("\nThe amount paid for the stock alone: $" + stockCost);
        System.out.println("The amount of the commission: $" + commission);
        System.out.println("The total amount paid: $" + total);

        sc.close();
    }
}
