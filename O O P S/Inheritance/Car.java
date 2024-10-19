class Vehicle {
    int wheels;
    void Start() {
        System.out.println("Vehicle is Starting");
	System.out.println("Number of Wheels = "+ wheels);	
    }
}

class Car extends Vehicle {
    public static void main(String[] args) {
        Car obj = new Car(); 
        obj.wheels = 4;
        obj.Start();    
    }
}