import javax.swing.*;

public class NumericalSystems {
    public static void main(String[] args) {
        String stringNumber = JOptionPane.showInputDialog(null, "Enter a number");

        int decimalNumber = 0;
        try {
            decimalNumber = Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        System.out.println("binary number = " + Integer.toBinaryString(decimalNumber));

        int binaryNumber = 0b1111011;
        System.out.println("binaryNumber = " + binaryNumber);

        System.out.println("octal number = " + Integer.toOctalString(decimalNumber));

        int octalNumber = 0173;
        System.out.println("octalNumber = " + octalNumber);

        System.out.println("hexadecimal number = " + Integer.toHexString(decimalNumber));

        int hexadecimalNumber = 0x7b;
        System.out.println("hexadecimalNumber = " + hexadecimalNumber);


        String msgBinary = "Binary number: " + Integer.toBinaryString(decimalNumber);
        String msgOctal = "Octal number: " + Integer.toOctalString(decimalNumber);
        String msgHexadecimal = "Hexadecimal number: " + Integer.toHexString(decimalNumber);

        JOptionPane.showMessageDialog(null, msgBinary + "\n" + msgOctal + "\n" + msgHexadecimal);
    }
}
