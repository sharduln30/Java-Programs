class InitializationBlocks{
	
	static{

			System.out.println("SIB");
		
	}	

	{

			System.out.println("IIB");

	}
	InitializationBlocks(){

			System.out.println("CIB");

	}
	
	public static void main(String args[]){

		System.out.println("main method");
		InitializationBlocks ib=new InitializationBlocks();/*on creating object of the 										class both IIB and CIB is printed*/	
	}
}