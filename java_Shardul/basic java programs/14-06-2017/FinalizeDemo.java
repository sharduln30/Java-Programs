class FinalizeDemo{
	
	public static void main(String args[]){
	
		 FinalizeDemo fd=new FinalizeDemo();	

		 Runtime rt=Runtime.getRuntime();

		 System.out.println("Before gc free memory="+rt.freeMemory());		 
		
		 fd=null;
		
		//System.gc();

		rt.gc();
		
		System.out.println("After gc free memory="+rt.freeMemory());	
	}		
	
	public void finalize(){
	
		 System.out.println("Finalize Method");

	}
}	
