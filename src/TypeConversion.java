public class TypeConversion {
    public static void main(String[] args) {
        String stringNumber = "50";
        int intNumber = Integer.parseInt(stringNumber);
        System.out.println("intNumber = " + intNumber);

        String stringReal = "9811.67e-3";
        double doubleReal = Double.parseDouble(stringReal);
        System.out.println("doubleReal = " + doubleReal);

        String logicalStr = "true";
        boolean logicalBoolean = Boolean.parseBoolean(logicalStr);
        System.out.println("logicalBoolean = " + logicalBoolean);

        int otherIntNumber = 100;
        System.out.println("otherIntNumber = " + otherIntNumber);

        String otherStringNumber = Integer.toString(otherIntNumber);
        System.out.println("otherStringNumber = " + otherStringNumber);

        otherStringNumber = String.valueOf(otherIntNumber + 10);
        System.out.println("otherStringNumber = " + otherStringNumber);

        double otherDoubleNumber = 1.455456;
        String otherDoubleString = Double.toString(otherDoubleNumber);
        System.out.println("otherDoubleString = " + otherDoubleString);

        otherDoubleString = String.valueOf(otherDoubleNumber);
        System.out.println("otherDoubleString = " + otherDoubleString);

        int i = 32768;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

        char c = (char) i;
        System.out.println("c = " + c);
        
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
