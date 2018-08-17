class CmdPallindrome{

	public static void main(String args[]){
		String s=args[0];
		int number=Integer.parseInt(s);
		int r=0,rev=0;
		int number2=number;
		while(number2>0)
		{
			r=number2%10;
			rev=rev*10+r;
			number2=number2/10;		
		} 	
		if(rev==number)
		System.out.println("It is a pallindrome no. ");
		else 
		System.out.println("It is not apallindrome no. ");	
	}
}