public class BooleanPrimitives {
    public static void main(String[] args) {
        boolean isTrue = true;
        System.out.println("isTrue = " + isTrue);

        boolean isFalse = Boolean.FALSE;
        System.out.println("isFalse = " + isFalse);

        double doubleNumber = 123456.78E-3;
        float floatNumber = 124578E3F;

        isTrue = doubleNumber > floatNumber;
        System.out.println("isTrue = " + isTrue);

        boolean isEqual = doubleNumber == floatNumber;
        System.out.println("isEqual = " + isEqual);
    }
}
