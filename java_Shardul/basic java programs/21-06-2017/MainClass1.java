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
}	

class C extends A{

	private int c;


	public void setC(int c){
	
		this.c=c;
		
	}
	public int getC(){
		
		return c;
		
		}

}	
class MainClass1{

	/*private Integer a;

	public static void main(String... k){

		MainClass1 m1=new MainClass1();
		m1.a=20;

		MainClass1 m2=new MainClass1();
		m2.a=20;
		
		System.out.println(m1.a==m2.a);
*/
	public static void main(String... k){

		B b=new B();

		C c=new C();
	
		b.setA(20);
		b.setB(30);
		c.setA(40);
		c.setC(50);
		System.out.println(b.getA()==c.getA());//true

		int sum=sum(b.getA()>c.getA()?b.getA():c.getA(),b.getB(),c.getC());
		System.out.println("Sum="+sum);

	}
	static int sum(int a,int b,int c){return a+b+c;}	
}