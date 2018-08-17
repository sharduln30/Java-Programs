import java.util.Scanner;
class MergeDemo{
	
	public static void main(String args[]){
	
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element in array A");
		
			  	
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		 }
		int b[]=new int[3];
		
		System.out.println("Enter Element in array B");
		
			  	
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		 }
		int c[]=new int[a.length+b.length];
		
		for(int i=0;i<c.length;i++){
		
		if(i<a.length){
			c[i]=a[i];
		}
		else{
			c[i]=b[i-a.length];
		}
	}
		System.out.println("Element in array c are");
		for(int i=0;i<c.length;i++){
		System.out.print(c[i]+" ");
		}
	}	
}