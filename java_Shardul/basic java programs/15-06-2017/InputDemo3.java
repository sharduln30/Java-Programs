//import java.io.Console;

class InputDemo3{
	
	public static void main(String args[]){

		java.io.Console c=System.console();//complete path
			  	
		 System.out.println("Enter you name");
		 String name=c.readLine();
		 System.out.println("Your name is "+name);
	}
}	
