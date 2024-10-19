class A {
    double myName(int a, int b) {
        return a + b; 
 }
    double myName(int b, int a) {
        return a * b; }
    public static void main(String[] args) {
        A obj = new A();  
        System.out.println("Result" + obj.myName(5, 10));
        System.out.println("Result: " + obj.myName(10, 5));
    }
}