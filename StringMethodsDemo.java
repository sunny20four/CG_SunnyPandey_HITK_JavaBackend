public class StringMethodsDemo {
    public static void main(String[] args) {

        String name = "  John Doe  ";

        System.out.println("Original String: '" + name + "'");
        System.out.println("Trimmed: '" + name.trim() + "'");
        System.out.println("Upper Case: " + name.toUpperCase());
        System.out.println("Lower Case: " + name.toLowerCase());
        System.out.println("Length: " + name.length());
    }
}