class CloneDemo implements Cloneable{
	
	int a;
	public static void main(String args[])throws CloneNotSupportedException{
	
		CloneDemo cd=new CloneDemo();		
		
		CloneDemo cd2=new CloneDemo(); 	
		
		System.out.println(cd.a);

		cd.a=10;

		Object o=cd.clone();
		
		CloneDemo cd1=(CloneDemo)o;

		System.out.println(cd1.a);

		System.out.println(cd2.a);
	
	}
}	
