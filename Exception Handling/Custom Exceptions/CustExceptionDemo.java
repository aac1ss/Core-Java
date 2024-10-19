class tooYoungException extends RuntimeException{

	tooYoungException(String s){
		super(s);

	}	
}

class tooOldException extends RuntimeException{

	tooOldException(String s){
		super(s);
		}
	}	
class CustExceptionDemo{
	
	public static void main(String[] args){
	int age=Integer.parseInt(args[0]);
	
	if(age<18){
	throw new tooYoungException("Please, Wait some more time !!!");
	}
	else if(age>60){
	throw new tooOldException("Please, Don't Wait,You have no time to get married! Rest up Oldie!!");
	}
	else{
	System.out.println("You are perfect candidate we will contact u soon via Email !");
	}
	
}
}