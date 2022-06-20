public class StringConcatenationExample {
    public static void main(String[] args) {
        String course = "Java";
        String professor = "Andres Guzman";

        String detail = course + " con el instructor " + professor;
        System.out.println(detail);

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail + numberA + numberB);
        System.out.println(detail + (numberA + numberB));

        System.out.println(numberA + numberB + course);

        String detail2 = course.concat(" con ").concat(professor);
        System.out.println("detail2 = " + detail2);
    }
}
