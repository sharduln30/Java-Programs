class A{
	
	private int a;

	public void setA(int a){

		this.a=a;

		}

	public int getA(){

		return a;
		}
	}

class B extends A{

	private int b;
	
	public void setB(int b){
	
		this.b=b;
}
	public int getB(){
		return b;
		}
	

class C extends B{

	private int c;

	public void setC(int c){
	
		this.c=c;
		System.out.println("c");
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