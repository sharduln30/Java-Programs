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
	
	public int sum(int a,int b){return a+b;}
	}

public class C{

	public static void main(String... k){

		B b=new B();

		b.setA(10);  
		b.setB(20);

		int a=b.getA();

		int sum=b.sum(a,b.getB());

		System.out.println("Sum="+sum);
	}
}
