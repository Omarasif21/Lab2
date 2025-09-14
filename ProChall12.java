/**

 * @author Omar Asif
 * @version 1.0
 * @since 2025-09-15
 */
import java.util.Scanner;

public class ProChall12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a city: ");
        String city = sc.nextLine();

        System.out.println("\nThe city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));

        sc.close();
    }
}
