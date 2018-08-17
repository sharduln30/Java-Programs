class A{

	int sum(int a,int b){

		System.out.println("a class method");
		return a+b;
	}
}
class B extends A{

	public int sum(int a,int b){
		
		super.sum(12,21);
		System.out.println("override method");
		return a+b;
	}


	public static void main(String args[]){

		B b=new B();

		int sum=b.sum(20,45);

		System.out.println(sum);
	}
}
