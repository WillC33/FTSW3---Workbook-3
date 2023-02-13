public class NameOverloading {
    private static void myMethod(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        myMethod("Any", "Name");
    }
}
