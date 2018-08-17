
public class Prime {  

   public static void main (String[ ] args) {

	int n=Integer.parseInt(args[0]);    

	System.out.println(n+"th prime number is ");

	int prime=1,count=0;
	while(count<n){
		int c=0;
		for(int i=1;i<=prime;i++) {

			if(prime%i==0)
				c++;

			}
		if(c==2){
			count++;
			if(count==n){
				System.out.println(prime);
				break;
			}	
			else prime++;
		}		
			else prime++;
	}	
  
 }

}

