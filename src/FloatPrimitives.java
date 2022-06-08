public class FloatPrimitives {
    public static void main(String[] args) {
        float floatNumber = 3.14f;
        System.out.println("floatNumber = " + floatNumber);

        float floatNumber2 = 1.5e4f;
        System.out.println("floatNumber2 = " + floatNumber2);

        float floatNumber3 = 1.5e-4f;
        System.out.println("floatNumber3 = " + floatNumber3);


        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        double doubleNumber = 3.14;
        System.out.println("doubleNumber = " + doubleNumber);
        System.out.println(Double.BYTES);
        System.out.println(Double.SIZE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        var varFloatNumber = 3.14f;
        System.out.println("varFloatNumber = " + varFloatNumber);
    }
}
