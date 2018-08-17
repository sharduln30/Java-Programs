interface First{

	int a=10;
	int sum(int a,int b);

}

interface Second{

	int a=10;
	int sum(int a,int b);

}

class MainClass implements First,Second{

	public static void main(String args[]){

	MainClass m=new MainClass();

	int s=m.sum(5,8);

	System.out.println("Sum="+s);
}

		public int sum(int a,int b){return a+b;}

}

