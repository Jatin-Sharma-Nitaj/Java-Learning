import java.util.Scanner;
import java.util.InputMismatchException; // Import InputMismatchException class

public class Count {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            // Check if the input is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                // Consume the invalid input to prevent an infinite loop
                sc.next();
            }
            // Read the integer input
            int n = sc.nextInt();
            int Num_of_Digit = 0;

            while (n > 0) {
                n = n / 10;
                Num_of_Digit++;
            }
            System.out.print("Number of Digits are: " + Num_of_Digit);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
