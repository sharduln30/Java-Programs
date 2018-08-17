class MethodOverloading{
	
	static int sum(float a,int b){

		System.out.println("sum(float,int) a="+a);
		return (int)a+b;
	}

	static int sum(byte a,int b){

		System.out.println("sum(byte,int) a="+a);
		return (int)a+b;
	}

	static int sum(double a,int b){

		System.out.println("sum(double,int) a="+a);
		return (int)a+b;
	}

	static int sum(short a,int b){

		System.out.println("sum(short,int)");
		return (int)a+b;
	}

	static int sum(int a,int b,int c){

		System.out.println("sum(int,int,int)");
		return a+b+c;
	}

	static int sum(int... k){

		int sum=0;
		
		System.out.println("sum(int...)");		
	
		for(int i=0;i<k.length;i++){
			sum=sum+k[i];
		}
		return sum;
	}
	public static void main(String args[]){

		double d=23.4;
		float f=54.4f;
		byte b=90;
		char c='a';
		int sum=sum(d,12);
		int sum1=sum(f,42);
		int sum2=sum(b,12);
		int sum3=sum(34.3f,12);
		int sum4=sum(34,12,34,3,3,345,36,7,86,43,4);
		System.out.println("Sum="+sum);
	}
}	
	