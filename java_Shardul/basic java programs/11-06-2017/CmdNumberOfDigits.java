class CmdNumberOfDigits{

	public static void main(String args[]){
		String s=args[0];
		int number=Integer.parseInt(s);
		int counter=0;
		while(number>0)
		{
			number/=10;
			counter++;		
		} 	
		System.out.println("No. of Digits="+counter);
	}
}