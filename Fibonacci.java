class Fibonacci {

	public static void main(String args[]){

		int n=Integer.parseInt(args[0]);
		int a=1,b=1,s=0,sum=0;
		System.out.println("The first 20 fibonacci numbedrs are :");
		System.out.print(a+" "+b);

		for(int i=1;i<=n-2;i++){
		
			s=a+b;
			sum=sum+s;
			a=b;
			b=s;
			System.out.print(" "+s);
		}
		double avg=(double)sum/n;
		System.out.println("\nThe average is "+avg);
	}
}