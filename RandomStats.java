import java.util.Random;
class RandomStats{

	public static void main(String args[]){

		Random r=new Random();

		int i,j,l=0,m=0,n=0,o=0,p=0;
		int a[][]=new int [10][20];
		for(i=0;i<10;i++){
	
			for(j=0;j<20;j++){
		
				a[i][j]=r.nextInt(100)+1;
				
			}
		}
		for(i=0;i<10;i++){
	
			for(j=0;j<20;j++){
		
			if(a[i][j]>=1 && a[i][j]<=20) l++;
			else if(a[i][j]>20 && a[i][j]<=40) m++;
			else if(a[i][j]>40 && a[i][j]<=60) n++;
			else if(a[i][j]>60 && a[i][j]<=80) o++;
			else if(a[i][j]>80 && a[i][j]<=100) p++;
			
			
			}
		}
		System.out.println(l+" "+m+" "+n+" "+o+" "+p);
		for(i=0;i<l/2;i++){
	
			System.out.print("*");
		}
		System.out.println();
			for(i=0;i<m/2;i++){
	
			System.out.print("*");
		}
		System.out.println();
		for(i=0;i<n/2;i++){
	
			System.out.print("*");
		}
		System.out.println();
		for(i=0;i<o/2;i++){
	
			System.out.print("*");
		}
		System.out.println();
		for(i=0;i<p/2;i++){
	
			System.out.print("*");
		}
		System.out.println();
	}// End of Method
}// End of class