class Main{
	public static void main(String[] args) {
		
		Work work = new Work();
        System.out.println("Using Work class:");
        System.out.println("Addition (Work): " + work.calculate(10, 5));

		Calculator add=(a,b)->a+b;	
		Calculator sub=(a,b)->a-b;
		Calculator mul=(a,b)->a*b;
		Calculator dib=(a,b)->{
		if(b==0){
			throw new ArithmeticException("Cannot divide by Zero");
		}
		return a/b;
		};
		int num1=10;
		int num2= 2;
		System.out.println("ADD"+add.calculate(num1,num2));
		System.out.println("Sub"+sub.calculate(num1,num2));
		System.out.println("Mul"+mul.calculate(num1,num2));
		System.out.println("Div"+div.calculate(num1,num2));

	}
}