class A {
    private String name; 
    private int r;
    A() {
        this("This is a Super Constructor"); }

    A(String a) {
        this(a, 6);
 }

    A(String a, int r) {
        this.name = a; 
        this.r = r;   
    }

    public static void main(String[] args) {
        A obj = new A(); 
       System.out.println("Name: " + obj.name + ", r: " + obj.r);
    }
}