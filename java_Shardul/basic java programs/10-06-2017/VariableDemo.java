class VariableDemo{

	int a;//non-static
	static int b;//static variable

	public static void main(String args[]){
		
		int c=20;//local variable
		VariableDemo vd=new VariableDemo();
             System.out.println("Non-static variable a="+vd.a);/*object is created so that non static                                                                 can be accessed in satic reference*/
		System.out.println("static variable b="+b);
		System.out.println("local variable c="+c);
	}
}