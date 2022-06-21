/*import java.util.Arrays;
import java.util.regex.Pattern;*/

public class StringFileExtensionExample {
    public static void main(String[] args) {
        String file = "any_image.jpeg";

        System.out.println("file.length() = " + file.length());

        /*System.out.println("file.split() = " + Arrays.asList(file.split(Pattern.quote("."))));*/

        int i = file.lastIndexOf(".");

        System.out.println("file.substring() = " + file.substring(i + 1));
    }
}
