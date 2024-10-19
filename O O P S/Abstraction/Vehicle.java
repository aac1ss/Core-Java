abstract class Vehicle{
	abstract void start();	
}

class Scooter extends Vehicle{
	@Override
	void start(){
	System.out.println("Scooter is Starting");
		} 
}

class Car extends Vehicle{
	@Override
	void start(){
	System.out.println("Car is Starting");
		}
	public static void main(String[] args){
	Car c=new Car();
	c.start();
	}
	
}
