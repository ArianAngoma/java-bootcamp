public class NumericalSystems {
    public static void main(String[] args) {
        int decimalNumber = 123;
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
    }
}
