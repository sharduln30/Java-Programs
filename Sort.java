import java.util.*;
class Sort{

	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		int a[]=new int [20];
		int i,j,temp=0;
		int sum=0;
		System.out.println("Enter the array");
		for(i=0;i<20;i++){
			a[i]=sc.nextInt();
			
				sum+=a[i];
			}
		System.out.print("The array is : ");
		for(i=0;i<20;i++){
			System.out.print(a[i]+" ");
			}

		double mean=sum/20.0;
		
		System.out.println("\nMean="+mean);
		double median=((double)a[9]+(double)a[10])/2;
		System.out.println("Median="+median);
		
		for(i=0;i<20;i++){
		for(j=0;j<20-i-1;j++){
		if(a[j]>a[j+1]){
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;

			}
		}
		}
		System.out.println("The array after sorting is :");
		for(i=0;i<20;i++){
		System.out.print(a[i]+"\t");
		}
	}// End of Method
}// End of class