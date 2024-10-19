class Pc{

	String name="DELL";
	
	public Pc(){
	System.out.println("The Model of ur Pc is "+name);
	}

//Non Static Class
		class Ram{
			int r=32;
			void info(){
				System.out.println("RAM Size: " + r + " GB");
			}

		}

		static class Display{
			String name="240 Hz";
			void disp(){
				System.out.println("YOu have "+name+"Display");
			}
		}
}

class Main{
	public static void main(String[] args){
		Pc pc=new Pc();
		Pc.Ram ram=pc.new Ram();
		Pc.Display disp=new Pc.Display();
			disp.disp();
		ram.info();
	}
}