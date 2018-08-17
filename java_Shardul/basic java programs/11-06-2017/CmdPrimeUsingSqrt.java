class CmdPrimeUsingSqrt{

	public static void main(String args[]){
		
		int number=Integer.parseInt(args[0]);
		boolean isPrime=true;

		for(int i=2;i<=Math.sqrt(number);i++)
		{
			if(number%i==0)
				isPrime=false;
			break;
	 	}
		
		if(isPrime)
		System.out.println("Given no. is Prime");
		else
		System.out.println("Given no. is not a Prime");	

	}
}