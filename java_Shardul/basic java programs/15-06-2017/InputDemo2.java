import java.io.InputStream;
import java.util.Scanner;

class InputDemo2{
	
	public static void main(String args[]){

		InputStream is=System.in;

		Scanner sc=new Scanner(System.in);

		/* System.out.println("Enter you name");
		 String name=sc.next();
		 System.out.println("Your name is "+name);*/

		 System.out.println("Enter your name");
		 String name1=sc.nextLine();
		 System.out.println("Enter your address");
		 String address=sc.nextLine();
		 System.out.println("Enter your age");
		 int age=sc.nextInt();
		
		System.out.println("Your name is "+name1);
		System.out.println("Your address is "+address);
		System.out.println("Your age name is "+age);

	}
}	
