class MethodReferencesDemo {
    public static void main(String[] args) {
        // Using method reference to refer to the String's toUpperCase method
        ConvertToUpperCase upperCase = String::toUpperCase;

        // Calling the method and printing the result
        System.out.println(upperCase.toConvertToUpperCase("Inside Lambda Expression :"));
    }
}