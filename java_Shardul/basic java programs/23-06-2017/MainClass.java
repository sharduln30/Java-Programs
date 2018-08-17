//upcasting
class First{

	int sum(int a,int b){

		System.out.println("first class sum method");
		
		return a+b;
	}
}

class Second extends First{

	int sum(int a,int b){

		System.out.println("second class sum method");
		
		return a+b;
	}
}
		
class Third extends First{

	//super.sum(a,b);

	int sum(int a,int b){

		System.out.println("third class sum method");
		
		return a+b;
	}
}

class MainClass{

	public static void main(String args[]){

		Second s=new Second();

		Third t=new Third();

		int a=CallToSum(s);

		int b=CallToSum(t);

		System.out.println(a);
		
		System.out.println(b);
	}

	static int CallToSum(First f){

		return f.sum(10,20);

	}
}	
