public class ImmutableStringExample {
    public static void main(String[] args) {
        String course = "Java";
        String professor = "Andres Guzman";

        String result = course.concat(professor);
        System.out.println("course = " + course);

        System.out.println(course == result);

        String result2 = course.transform((c) -> c + " con " + professor);
        System.out.println("course = " + course);

        System.out.println("result2 = " + result2);

        String result3 = result.replace("a", "A");
        System.out.println("result = " + result);

        System.out.println("result3 = " + result3);
    }
}
