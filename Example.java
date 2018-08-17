import java.io.*;
class Example{

	public static void main(String args[]){

		InputStreamReader isr=new InputStreamReader(System.in);

		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter your first name");

		String name="";
		try {
			name = br.readLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		System.out.println("Your name is :"+name);
	}
}