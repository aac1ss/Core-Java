// Class with different access modifiers
class AccessModifiersExample {

    // Public variable: accessible from anywhere
    public String publicVariable = "I am public";

    // Protected variable: accessible within the same package and subclasses
    protected String protectedVariable = "I am protected";

    // Default (package-private) variable: accessible only within the same package
    String defaultVariable = "I am default";

    // Private variable: accessible only within this class
    private String privateVariable = "I am private";

    // Public method to display the variables
    public void displayVariables() {
        System.out.println(publicVariable);
        System.out.println(protectedVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);
    }
}

// Another class in the same package
class AnotherClass {
    public void accessModifiers() {
        AccessModifiersExample example = new AccessModifiersExample();
        example.displayVariables();
        System.out.println(example.publicVariable); // Accessible
        System.out.println(example.protectedVariable); // Accessible since it's in the same package
        System.out.println(example.defaultVariable); // Accessible since it's in the same package
        // System.out.println(example.privateVariable); // Not accessible (uncommenting will cause a compile error)
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        example.displayVariables(); // Display all variables

        AnotherClass anotherClass = new AnotherClass();
        anotherClass.accessModifiers(); // Access variables from another class
    }
}