import first.First;

class AccessFirstPackage{

	public static void main(String args[]){

		First f=new First();	
	
		int s=first.First.sum(15,20);

		System.out.println(s);
	}
}

