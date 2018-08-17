import java.util.Scanner;
class Withdrawal{

	public static void main(String args[])throws UnsufficientBalance{

		System.out.println("Enter your pin");

		Scanner sc=new Scanner(System.in);

		int pin=sc.nextInt();

		System.out.println("Enter amount");

		double amount=sc.nextDouble();

		if(pin==4321){

			if(amount>=500){

				throw new UnsufficientBalance("Unsufficient Balance");
			}else{

				System.out.println("Balance: "+(500-amount));
				
			}
		}else{

				System.out.println("INVALID PIN");
				
			}



	}	
}