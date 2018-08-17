class CmdSum{

	public static void main(String args[]){
		
		String s1=args[0];
		int a=Integer.parseInt(s1); 
		int b=Integer.parseInt(args[1]);
		int sum=a+b;
	System.out.println("Sum:-"+sum);//two exceptions-no. forbid & array index out of bounds
}
}