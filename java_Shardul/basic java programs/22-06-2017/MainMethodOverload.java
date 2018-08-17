class MainMethodOverload{
	
	public static void main(){
		
		System.out.println("main()");

	}
	public static void main(String args){

		System.out.println("main(String)");

	}

	/*public static void main(String args[]){

		System.out.println("main(String args[])");

	}*/

	public static void main(String... k){

		System.out.println("main(String... k)");
	
		main();

	}
}	
	