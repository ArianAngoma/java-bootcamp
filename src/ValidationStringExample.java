public class ValidationStringExample {
    public static void main(String[] args) {
        String course = null;

        boolean isNull = course == null;

        System.out.println("isNull = " + isNull);

        if (isNull) {
            course = "";
        }

        boolean isEmpty = course.length() == 0;
        boolean isEmpty2 = course.isEmpty();

        boolean isBlank = course.isBlank();

        if (!isBlank) {
            System.out.println(course.toUpperCase());
            System.out.println("Bienvenido ".concat(course));
            System.out.println("Bienvenido " + course); // "Bienvenido null"
        }
    }
}
