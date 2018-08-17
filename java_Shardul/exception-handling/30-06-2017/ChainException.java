import java.io.*;
class ChainException{

	ChainException(){

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");

		try{
			String name=br.readLine();
		
		System.out.println("Name:-"+name);
		}catch(IOException e){}

	}
		public static void main(String args[])throws IOException{
		
			ChainException ce=new ChainException();			
				
		}

}
