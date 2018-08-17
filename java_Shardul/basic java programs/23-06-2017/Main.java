class One{

	void className(){

		System.out.println("class one");
		
	}
}

class Two extends One{

	void className(){

		System.out.println("class two");

	}
}
		
class Main{

	public static void main(String args[]){

		One o=new Two();//Upcasting

		o.className();

		//Two t=(Two)new One();//ClassCastException

		Two t=(Two)o;//Downcasting

		t.className();
	}
}	
