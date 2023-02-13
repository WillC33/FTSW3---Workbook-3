public class NameOverloading {
    private static void myMethod(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    private static void myMethod(String firstName, String middleName, String lastName) {
        System.out.println(firstName + " " + middleName + " " + lastName);
    }

    public static void main(String[] args) {
        myMethod("Any", "Name");
        myMethod("Any", "Overloaded", "Name");
    }
}
