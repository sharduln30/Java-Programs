class CmdReverse{

	public static void main(String args[]){
		String s=args[0];
		int number=Integer.parseInt(s);
		int r=0,rev=0;
		while(number>0)
		{
			r=number%10;
			rev=rev*10+r;
			number=number/10;		
		} 	
		System.out.println("Reverse of the no. ="+rev);
	}
}