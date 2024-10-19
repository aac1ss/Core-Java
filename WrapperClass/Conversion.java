class Conversion {
    
    void intStr() {
        Integer I = 22; // Integer object
        int i = 2; // Primitive int

        // Convert int to String
        String ni1 = String.valueOf(i); // int -> String
        System.out.println("Converting int to String [String.valueOf(i)] = " + ni1);
        
        // Convert String to int
        int ni2 = Integer.parseInt(ni1); // String -> int
        System.out.println("Converting String to int [Integer.parseInt(ni1)] = " + ni2);  
        
        // Convert Integer to String
        String I1 = Integer.toString(I); // Integer -> String
        System.out.println("Converting Integer to String [Integer.toString(I)] = " + I1);  
        
        // Convert String to Integer
        Integer I2 = Integer.valueOf(I1); // String -> Integer
        System.out.println("Converting String to Integer [Integer.valueOf(I1)] = " + I2);  
    }

    void DobStr() {
        double d = 69.69; // Primitive double
        
        // Convert double to String
        String ni1 = String.valueOf(d); // double -> String
        System.out.println("Converting double to String [String.valueOf(d)] = " + ni1);
        
        // Convert String to double
        double ni2 = Double.parseDouble(ni1); // String -> double
        System.out.println("Converting String to double [Double.parseDouble(ni1)] = " + ni2);  
        
        // Convert double to String
        String I1 = Double.toString(d); // double -> String
        System.out.println("Converting double to String [Double.toString(d)] = " + I1);  
        
        // Convert String to Double
        Double I2 = Double.valueOf(ni1); // String -> Double
        System.out.println("Converting String to Double [Double.valueOf(ni1)] = " + I2);  
    }

    public static void main(String args[]) {
        Conversion r = new Conversion();
        r.intStr(); // Call the intStr method
        r.DobStr(); // Call the DobStr method
    }
}