public class MethodDemo {
    // Main method
    public static void main(String[] args) {
        // Calling the greet method
        greet();
        
        // Calling the printMessage method with a custom message
        printMessage("This is my message!");
    }

    // Method to print a greeting message
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // Method to print a given message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
