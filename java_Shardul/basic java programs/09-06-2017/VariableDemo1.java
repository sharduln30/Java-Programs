class VariableDemo1{

	int a;//non-static
	static int b;//static variable

	public static void main(String args[]){
		
		int b=10;//local variable
 		//System.out.println("non-static variable a="+a);
		System.out.println("static variable a="+b);
		System.out.println("static variable b="+b);
		System.out.println("local variable c="+b);
	}
}