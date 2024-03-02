package Threading;


class Test implements Runnable{
	
	public void run()
	{
		
		while(true)
		{
			
			System.out.println("In Test " +Thread.currentThread().getName() );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class TestThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t= new Thread(new Test());
		
		t.start();
		
		
	Thread t1= new Thread(new Test());
		
		t1.start();
		
		
		while(true)
		{
			
			System.out.println("In main" + t.getId()+"  "+t.getName() );
			Thread.sleep(1000);
		}
		
		
		
		
	}

}
