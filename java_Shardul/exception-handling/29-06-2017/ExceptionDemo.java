class ExceptionDemo{

	public static void main(String args[]){

		System.out.println("main method start");

		try{
			int a=1/0;//abnormal termination
		}catch(ArithmeticException ae){

			System.out.println("cannot divide by 0");		
		
		}
		System.out.println("main method end");
	}

}