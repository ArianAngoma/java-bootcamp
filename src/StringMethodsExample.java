public class StringMethodsExample {
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
        
        String sister = "Andrea";

        System.out.println("sister.replace(\"a\", \"*\") = " + sister.replace("a", "*"));

        System.out.println("sister.indexOf(\"d\") = " + sister.indexOf("d"));
        
        System.out.println("sister.lastIndexOf(\"a\") = " + sister.lastIndexOf("a"));

        System.out.println("sister.indexOf(\"z\") = " + sister.indexOf("z"));

        System.out.println("sister.contains(\"e\") = " + sister.contains("e"));
        System.out.println("sister.contains(\"No dreo\") = " + sister.contains("No dreo"));


        System.out.println("sister.startsWith(\"A\") = " + sister.startsWith("A"));
        System.out.println("sister.startsWith(\"TRaba\") = " + sister.startsWith("TRaba"));

        System.out.println("sister.endsWith(\"drea\") = " + sister.endsWith("drea"));
        System.out.println("sister.endsWith(\"vilchez\") = " + sister.endsWith("vilchez"));

        System.out.println(" Andrea ");
        System.out.println(" Andrea ".trim());
    }
}
