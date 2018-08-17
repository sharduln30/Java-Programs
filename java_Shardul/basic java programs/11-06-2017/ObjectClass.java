class ObjectClass{

	public static void main(String args[]){
	
		ObjectClass oc=new ObjectClass();
			
 	
		System.out.println("hash code ="+oc.hashCode());

		System.out.println("class name="+oc.getClass());

		System.out.println(oc);
	
	}
	public String toString(){
			
		//return "Hello";
		return getClass()+"@"+Integer.toHexString(hashCode());
	}	
}