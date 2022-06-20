public class StringExample {
    public static void main(String[] args) {
        String course = "Java";
        String course2 = new String("Java");
        String course3 = "java";

        System.out.println(course == course2);

        System.out.println(course.equals(course2));

        System.out.println(course.equalsIgnoreCase(course3));

        String course4 = "Java";
        System.out.println(course == course4);
    }
}
