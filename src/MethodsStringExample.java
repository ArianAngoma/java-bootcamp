public class MethodsStringExample {
    public static void main(String[] args) {
        String name = "Arian Angoma";

        System.out.println("name.length() = " + name.length());

        System.out.println("name.toUpperCase() = " + name.toUpperCase());

        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        System.out.println("name.equals(\"Arian Angoma\") = " + name.equals("Arian Angoma"));

        System.out.println("name.equals(\"arian angoma\") = " + name.equals("arian angoma"));

        System.out.println("name.equalsIgnoreCase(\"arian angoma\") = " + name.equalsIgnoreCase("arian angoma"));

        System.out.println("name.compareTo(\"Arian Angoma\") = " + name.compareTo("Arian Angoma"));

        System.out.println("name.compareTo(\"Andrea\") = " + name.compareTo("Andrea"));

        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(2) = " + name.charAt(2));
        System.out.println("name.charAt(11) = " + name.charAt(11));
        System.out.println("name.charAt(name.length() - 1) = " + name.charAt(name.length() - 1));

        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(6, 8) = " + name.substring(6, 8));
        System.out.println("name.substring(name.length() - 1) = " + name.substring(name.length() - 1));
    }
}
