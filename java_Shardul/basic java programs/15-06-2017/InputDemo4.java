import java.io.*;

class InputDemo4{
	
	public static void main(String args[])throws IOException{

		DataInputStream dis=new DataInputStream(System.in);
			  	
		 System.out.println("Enter you name");
		 String name=dis.readLine();
		 System.out.println("Your name is "+name);
	}
}	
