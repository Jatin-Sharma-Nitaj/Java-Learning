
import java.util.Scanner;
public class change_name {
    public static void main(String[]args)
    {
        System.err.print("Enter Your Number :");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(sc.hasNextInt());
        }
    }
}
