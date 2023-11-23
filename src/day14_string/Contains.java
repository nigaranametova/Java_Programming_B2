package day14_string;

/*
    .equals(String)
    .equalIgnoreCase(String)
    .length()
    .toUpperCase()
    .toLowerCase()
    .startsWith(String)
    .endsWith(String)
 */
public class Contains {
    public static void main(String[] args) {
        String day = "Today it was day36_inheritance.app.access.day36_inheritance.access.a.a Java class.";

        System.out.println(day.contains("it was"));  // true
        System.out.println(day.contains("itwas"));   // false

        String str = "was day36_inheritance.app.access.day36_inheritance.access.a.a SoftSkills";
        System.out.println(day.contains(str));

        System.out.println(day.contains("Today class."));
        System.out.println(day.contains("It was day36_inheritance.app.access.day36_inheritance.access.a.a Java class."));
        System.out.println(day.contains(" "));
        System.out.println(day.contains("w"));
        System.out.println(day.contains("x"));

        System.out.println(day.contains("5"));

        System.out.println(day.contains(""));

        System.out.println(day + " Or not.");// "Today it was day36_inheritance.app.access.day36_inheritance.access.a.a Java class."
        System.out.println(day.contains(" Or not."));

        System.out.println("------------------");
        System.out.println((day + " Or not.").contains(" Or not."));
        System.out.println(day.contains(" Or not.")); //"Today it was day36_inheritance.app.access.day36_inheritance.access.a.a Java class."

        //"Today it was day36_inheritance.app.access.day36_inheritance.access.a.a Java class."
        if (day.contains("java")) {
            System.out.println("There is day36_inheritance.app.access.day36_inheritance.access.a.a coding language name in this sentence");
        }

        //"Today it was day36_inheritance.app.access.day36_inheritance.access.a.a Java class."
        if (day.contains("Java")) {
            System.out.println("There is day36_inheritance.app.access.day36_inheritance.access.a.a coding language name in this sentence");
        }

        System.out.println(day.contains("t w"));


    }

}
