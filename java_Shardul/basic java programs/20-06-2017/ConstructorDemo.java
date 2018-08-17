class ConstructorDemo{
	
	ConstructorDemo(int a){
	
		//super(a);
		super();
		System.out.println("parameterized constructor a="+a);
		
	}
	ConstructorDemo(){
		
		this(10);
		System.out.println("Default constructor");
	}

	public static void main(String args[]){
	
		ConstructorDemo cd=new ConstructorDemo();
		//ConstructorDemo cd1=new ConstructorDemo(20);

	}
}