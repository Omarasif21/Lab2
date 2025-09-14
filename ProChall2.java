/**

 * @author Omar Asif
 * @version 1.0
 * @since 2025-09-15
 */
import java.util.Scanner;

public class ProChall2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        char firstInit = firstName.charAt(0);
        char middleInit = middleName.charAt(0);
        char lastInit = lastName.charAt(0);

        System.out.println("\nMy name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);

        sc.close();
    }
}
