public class CharactersPrimitives {
    public static void main(String[] args) {
        char character = 'A';
        System.out.println("character = " + character);

        char character2 = '\u0041';
        System.out.println("character2 = " + character2);

        char charNumber = '1';
        System.out.println("charNumber = " + charNumber);

        char charCharacter = 64;
        System.out.println("charNumber2 = " + charCharacter);

        System.out.println(Character.BYTES);
        System.out.println(Character.SIZE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        char space = '\u0020';
        System.out.println("space = " + space);

        char back = '\b';
        System.out.println("back =" + back);

        char tab = '\t';
        System.out.println("tab =" + tab);

        char newLine = '\n';
        System.out.println("newLine =" + newLine);

        char carriageReturn = '\r';
        System.out.println("carriageReturn =" + carriageReturn);

        System.out.println(System.getProperty("line.separator"));
        System.lineSeparator();
    }
}
