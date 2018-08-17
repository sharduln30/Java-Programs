package thread;

public class FirstThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println("run method");
		System.out.println("Thread :- "+Thread.currentThread());
	}
	
	public static void main(String[] args) {
		
		FirstThread ft = new FirstThread();
		
		//ft.run();
		
		ft.setName("second thread");
		
		ft.start();
		
		ft.setPriority(1);
		
		
		
		System.out.println(ft.getState());
		System.out.println(ft.getId());
		System.out.println("Thread :- "+Thread.currentThread());
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.getId());
		
		//[main,5,main]
		
	}
	
	

}
