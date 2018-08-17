class NestedTryBlock2{

	public static void main(String args[]){

		try{

			int a=1/0;
			System.out.println(1);

		}catch(ArithmeticException ae){

			System.out.println(2);
			try{

				int a=1/0;			
				System.out.println(3);

			}catch(ArithmeticException ae1){
			
				System.out.println(4);	
				
			}
			finally{


			System.out.println(5);	
		
			}}finally{

			System.out.println(6);	
		
		}

	}

}