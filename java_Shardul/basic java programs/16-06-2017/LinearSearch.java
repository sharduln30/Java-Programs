import java.util.Scanner;
class LinearSearch{
	
	public static void main(String args[]){
	
		int a[]={23,532,544,324,244,976,444};
		boolean isSearched=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element to be searched");
		int searchElement=sc.nextInt();	
		for(int i=0;i<a.length;i++){
			if(a[i]==searchElement)
			isSearched=true;
			break;

		 }
			if(isSearched)		 
			System.out.println("Element is Searched");

			else
			System.out.println("Element is not Searched");
	}
}	
