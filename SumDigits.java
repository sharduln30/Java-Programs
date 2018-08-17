class SumDigits {

	public static void main(String args[]){

		int n=Integer.parseInt(args[0]);
		int r=0,s=0;
		System.out.print("The sum of digits= ");
		int rev =0;

		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}

		while(rev>0) {
			r=rev%10;
			s=s+r;
			if(rev>9)
			System.out.print(r+"+");
			else
			System.out.print(r);
			rev=rev/10;}
		System.out.println("= "+s);
	}
}