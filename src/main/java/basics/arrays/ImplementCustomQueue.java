package basics.arrays;

public class ImplementCustomQueue {
	
	public static class queue {
		
	  private	int[] queue;
	  private	int front;
	  private	int size;
		
		public queue(int n)
		{
			queue= new int[n];
			this.front=0;
			this.size =0;
			
		}
		
		
		public void display() {
			
			if(size == 0)
			{
				System.out.println("Queue Underflow");
			}
			else
			{
				for(int i=0 ; i< size; i++)
				{
					int val = (front+i)% queue.length;
					
					System.out.print(queue[val] + " ");
				}
				System.out.println();
			}
			
		}
		
		public int remove() {
			if(size==0)
			{
				System.out.println("Queue Underflow");
				return -1;
			}
			else {
				int val=queue[front ];
				front = (front+1) % queue.length;
				size--;
				return val;
			}
			
		}
		
		public void add(int data) {
			if(size == queue.length)
			{
				System.out.println("Queue Overflow");
			}
			else {
				int rear= (front + size) % queue.length;
				queue[rear]=data;
				size++;
						
				
			}
			
		}
		
		public int peek() {
			
			if(size==0)
			{
				System.out.println("Queue Underflow");
				return -1;
			}
			else
			{
				
				return queue[front];
			}
		
			
		}
		
		
		public int size()
		{
			return this.size;
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		queue qu = new queue(5);
		qu.display();
		qu.add(10);
		qu.display();
		qu.add(20);
		qu.display();
		qu.add(30);
		qu.display();
		qu.add(40);
		qu.display();
		qu.add(50);
		qu.display();
		qu.add(60);
		qu.display();
		System.out.println(qu.peek());
		System.out.println(qu.remove());
		System.out.println(qu.peek());
		System.out.println(qu.remove());
		System.out.println(qu.peek());
		System.out.println(qu.remove());
		System.out.println(qu.peek());
		qu.add(10);
		qu.add(20);
		qu.add(30);
		qu.add(40);
		System.out.println(qu.peek());
		
		qu.display();
		
		
	}
	

}
