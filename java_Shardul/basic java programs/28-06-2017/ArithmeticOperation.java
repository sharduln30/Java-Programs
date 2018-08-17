package java1.ao;

public class ArithmeticOperation{

	public static int sum(int... k){

		int sum=0;

		for(int i=0;i<k.length;i++){

			sum+=k[i];		

		}

		return sum;
	}

	public static int sub(int... k){

		int sub=k[0];

		for(int i=0;i<k.length;i++){

			sub-=k[i];		

		}
		
		return sub;	
	}
}