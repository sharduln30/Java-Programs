class CmdPrime{

	public static void main(String args[]){
		String s=args[0];
		int number=Integer.parseInt(s);
		int c=0;
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
				c++;
	 	}
		
		if(c==0)
		System.out.println("It is a prime No.");
		else
		System.out.println("It is not a prime No.");	

	}
}