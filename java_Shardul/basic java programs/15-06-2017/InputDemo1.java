import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
class InputDemo1{
	
	public static void main(String args[])throws IOException{

		InputStream is=System.in;

		InputStreamReader isr=new InputStreamReader(is);

		Reader r=isr;

		BufferedReader br=new BufferedReader(r);
		//=new BufferedReader(new InputStreamReader(System.in));
			  	
		 System.out.println("Enter you name");
		 String name=br.readLine();
		 System.out.println("Your name is "+name);
	}
}	
