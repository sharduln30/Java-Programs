import java.util.Scanner;
class BinarySearching{
	
	public static void main(String args[]){
	
		int a[]={10,30,40,90,120};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element to be searched");
		int element=sc.nextInt();
		boolean isSearched=binarySearching(a,element);
		System.out.println(isSearched);

	}
	static boolean binarySearching(int a[],int searchElement){
		
		boolean isSearched=false;
		int min=0;
		int max=a.length-1;
		while(min<=max){
			int mid=(min+max)/2;
			if(a[mid]==searchElement){
				isSearched=true;
				break;
			}else if(a[mid]>searchElement){
				max=mid-1;
			}else
				min=mid+1;

		}			
		return isSearched;	
		
	}

}

