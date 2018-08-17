class MultipleCatches{

	public static void main(String args[]){

		try{
		
		int a=Integer.parseInt(args[0]);

		int b=Integer.parseInt(args[1]);

		int sum=a+b;

		System.out.println(sum);
		
		}catch(ArrayIndexOutOfBoundsException ae){

			System.out.println("Enter two elements");		

		}catch(NumberFormatException ne){

			System.out.println("Enter valid number");	
		
		}catch(Exception e){}

	}


}