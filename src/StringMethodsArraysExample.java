public class StringMethodsArraysExample {
    public static void main(String[] args) {
        String name = "Arian Angoma";
        System.out.println("name = " + name);

        System.out.println("name.toCharArray()  = " + name.toCharArray());

        char[] array = name.toCharArray();

        int large = array.length;

        for (int i = 0; i < large; i++) {
            System.out.print(array[i]);
        }

        System.out.println("\nname.split(\"a\") = " + name.split("a"));

        String[] array2 = name.split("a");
        int l = array2.length;

        for (int j = 0; j < l; j++) {
            System.out.print(array2[j]);
        }

        String file = "any_image.jpeg";

        String[] fileArray = file.split("\\."); // [.]

        l = fileArray.length;

        for (int j = 0; j < l; j++) {
            System.out.print(fileArray[j]);
        }

        System.out.println("\nExtensión = " + fileArray[l - 1]);
    }
}
