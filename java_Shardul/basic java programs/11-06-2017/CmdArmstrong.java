class CmdArmstrong{

	public static void main(String args[]){
		String s=args[0];

		int number=Integer.parseInt(s);
		int temp=number;
		int counter=0;
		while(number>0)
		{
			number/=10;
			counter++;		
		}
 		number=temp;
		int armStrongNumber=0;
		while(number>0)
		{
			int r=number%10;
			number/=10;
			armStrongNumber=armStrongNumber+(int)Math.pow(r,counter);
		}
		if(armStrongNumber==temp)
		System.out.println("Given No.is Armstrong");
		else
		System.out.println("Given No.is not an Armstrong");
		
	}
}