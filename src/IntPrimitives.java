public class IntPrimitives {
    public static void main(String[] args) {
        byte byteNumber = 127;
        System.out.println("byteNumber = " + byteNumber);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short shortNumber = 32767;
        System.out.println("shortNumber = " + shortNumber);
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        int intNumber = 2147483647;
        System.out.println("intNumber = " + intNumber);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        long longNumber = 9223372036854775807L;
        System.out.println("longNumber = " + longNumber);
        System.out.println(Long.BYTES);
        System.out.println(Long.SIZE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        var varNumber = 9223372036854775807L;
    }
}
