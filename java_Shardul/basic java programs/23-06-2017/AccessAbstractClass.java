abstract class AbstractDemo{

	abstract int sum(int a,int b);
	
	AbstractDemo(){

	System.out.println("abstract class");
	
	}
}
class AccessAbstractClass extends AbstractDemo{

	int sum(int a,int b){

	System.out.println("Abstract method override");

	return a+b;
	
	}

	public static void main(String arhs[]){

	AccessAbstractClass aac=new AccessAbstractClass();

	int sum=aac.sum(30,40);

	System.out.println(sum);
	
	}
}