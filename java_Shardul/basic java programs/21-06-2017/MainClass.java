class A{
	
	private int a;

	A(){

			System.out.println("A class const.");
		}	

	public void setA(int a){
	
	this.a=a;

		}

	public int getA(){

		return a;
		}
	}

class B extends A{

	private int b;

	B(int a){

		System.out.println("B class const.="+a);
	}
	
	public void setB(int b){
	
		this.b=b;
	}
	public int getB(){
		return b;
	}
}	

class C extends B{

	private int c;

		C(){
			super(8);
			System.out.println("C class constant");
     		   }


	public void setC(int c){
	
		this.c=c;
		
	}
	public int getC(){
		
		return c;
		
		}
	public int sum(int a,int b,int c){return a+b+c;}
}	
class MainClass{

	public static void main(String... k){

		C c=new C();
	}
}