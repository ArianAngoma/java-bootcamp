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
    }
}
