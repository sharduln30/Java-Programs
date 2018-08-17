class EqualsDemo{
	
	public static void main(String args[]){
	
		String s="Abc";		
		
		 String s1=new String("abc"); 	
		
		 String s2=new String("abc");
 	
		 String s3=new String("Abc"); 	

		 String s4="abc";

		 String s5="Abc"; 			  	
		System.out.println(s==s5);

		System.out.println(s==s3);
	
		System.out.println(s.equals(s3));

		System.out.println(s4==s5);
	}
}	
