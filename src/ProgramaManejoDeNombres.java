import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre de tu familia: ");
        String name1 = scanner.nextLine();

        char name1SecondCharacter = name1.charAt(1);
        String name1LastCharacter = name1.substring(name1.length() - 2);
        String name1Edited = Character.toString(name1SecondCharacter).toUpperCase()
                .concat(".")
                .concat(name1LastCharacter);

        System.out.println("Ingrese el segundo nombre de tu familia: ");
        String name2 = scanner.nextLine();

        char name2SecondCharacter = name2.charAt(1);
        String name2LastCharacter = name2.substring(name2.length() - 2);
        String name2Edited = Character.toString(name2SecondCharacter).toUpperCase()
                .concat(".")
                .concat(name2LastCharacter);

        System.out.println("Ingrese el terce nombre de tu familia: ");
        String name3 = scanner.nextLine();

        char name3SecondCharacter = name3.charAt(1);
        String name3LastCharacter = name3.substring(name3.length() - 2);
        String name3Edited = Character.toString(name3SecondCharacter).toUpperCase()
                .concat(".")
                .concat(name3LastCharacter);


        System.out.println(
                name1Edited.concat("_")
                        .concat(name2Edited)
                        .concat("_")
                        .concat(name3Edited)
        );
    }
}
