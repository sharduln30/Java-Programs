class ArrayMerging{
	
	public static void main(String args[]){
	
		int a[]={123,44,2,323,23,57,32};
		int b[]={23,6,80,24,86,34};
			  	
		System.out.println("Merging a and b....");

		int c[]=merge(a,b);
		for(int i=0;i<c.length;i++){
		System.out.println("c["+i+"]="+c[i]);

	}	 
	}
	static int[] merge(int a[],int b[]){

		int c[]=new int[a.length+b.length];
		for(int i=0;i<c.length;i++){
			if(i<a.length){
				c[i]=a[i];
			}
			else{
				c[i]=b[i-a.length];
			}
		}
		return c;

	}

}	
