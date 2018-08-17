import java.io.InputStreamReader;
//import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
class SumDemo{
	
		static String s1;
		static String s2;
		static BufferedReader br;

	public static void main(String args[])throws IOException{

 		br=new BufferedReader(new InputStreamReader(System.in));
		insertNum();
		int s=calc();
		displaySum(s);
 	}
	
	static void insertNum()throws IOException{
		  	
		 System.out.println("Enter 1st number");
		 s1=br.readLine();
		 System.out.println("Enter 2nd number");
		 s2=br.readLine();
}
	static int calc(){
	
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int sum=a+b;
		return sum;
}	
	static void displaySum(int s){
	
		System.out.println("Sum = "+s);


	
	}
}	
