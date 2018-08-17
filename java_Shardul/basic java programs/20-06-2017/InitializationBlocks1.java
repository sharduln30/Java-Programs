class InitializationBlocks1{
	
	static{

			System.out.println("SIB");
			String s[]={};
			//main(s);
			main();
		
	}	

	{

			System.out.println("IIB");

	}
	InitializationBlocks1(){

			System.out.println("CIB");

	}
	
	public static void main(String... k){

				System.out.println("main method");

	}
}