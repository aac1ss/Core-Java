// Starting a Vehicle //


import java.util.Scanner;

abstract class Vehicle{
	abstract void start();
}

class Bike extends Vehicle{
	@Override
	void start(){
		System.out.println("Bike is Starting");
	}
}

class Car extends Vehicle{
	@Override
	void start(){
		System.out.println("Car is starting ");
	}


}

public class Abstract{
	void option(){
	System.out.println("Which Vehicle do u want to start ?? ");
	System.out.println("Choose"+" B "+"for Bike"+" C "+"for Car");
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	ch=Character.toLowerCase(ch);
	
	if(ch=='b'){
	Bike bike=new Bike();
	bike.start();
	}
	else if(ch=='c'){
	Car car=new Car();
	car.start();
	}
	else{
	System.out.println("Invalid Entry");
	}
	}
	public static void main(String[] args){
	Abstract ab=new Abstract();
	ab.option();
	}

}