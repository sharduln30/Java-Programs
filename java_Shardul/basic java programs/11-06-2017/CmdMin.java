class CmdMin {

	public static void main(String args[]){
		int min=Integer.parseInt(args[0]);;
		for(int i=0;i<args.length;i++){
		int b=Integer.parseInt(args[i]);
		if(min>b){
			min=b;
		}
		}
 		System.out.println("Minimum No.="+min);
	}
}