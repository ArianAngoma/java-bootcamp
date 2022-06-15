import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericalSystemsScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer number: ");

        // String stringNumber = scanner.nextLine();

        int decimalNumber = 0;
        try {
            decimalNumber = scanner.nextInt(); // Integer.parseInt(stringNumber);
        } catch (Exception e) {
            System.out.println("Must enter an integer");
            main(args);
            System.exit(0);
        }

        String msgBinary = "Binary number: " + Integer.toBinaryString(decimalNumber);
        String msgOctal = "Octal number: " + Integer.toOctalString(decimalNumber);
        String msgHexadecimal = "Hexadecimal number: " + Integer.toHexString(decimalNumber);

        String msg = msgBinary + "\n" + msgOctal + "\n" + msgHexadecimal;

        System.out.println(msg);
    }
}
