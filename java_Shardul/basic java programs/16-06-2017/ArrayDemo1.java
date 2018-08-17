import java.util.Scanner;
class ArrayDemo1{
	
	public static void main(String args[]){
	
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of array elements");
		for(int i=0;i<a.length;i++){
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
		 }
		 System.out.println("Array Elements are...");
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}	
