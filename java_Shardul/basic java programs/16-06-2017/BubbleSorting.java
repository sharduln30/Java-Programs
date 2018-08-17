class BubbleSorting{
	
	public static void main(String args[]){
	
	int a[]={23,532,544,324,244,976,444};
	bubbleSort(a);	
	}
	static void bubbleSort(int a[]){

	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length-1-i;j++){
			if(a[j]>a[j+1]){
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
	for(int i=0;i<a.length;i++){
	System.out.println(a[i]);
	}
   }
}	
