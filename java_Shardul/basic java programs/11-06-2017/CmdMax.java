class CmdMax {

	public static void main(String args[]){
		int max=0;
		for(int i=0;i<args.length;i++){
		int b=Integer.parseInt(args[i]);
		if(max<b){
			max=b;
		}
		}
 		System.out.println("Maximum No.="+max);
	}
}