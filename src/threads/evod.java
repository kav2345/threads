package threads;
class begin implements Runnable{
	static int count=1;
	Object obj;
	public begin(Object obj) {
		super();
		this.obj=obj;
	}
	@Override
	public void run(){
			while(count<=10) {
				if(count%2==0 && Thread.currentThread().getName().equals("Even")&&count<=10){
					synchronized(obj) {
						System.out.println("Thread name:"+Thread.currentThread().getName()+"value:"+count);
						try {
						Thread.sleep(2000);
						}
						catch(InterruptedException e) {
							e.printStackTrace();
						}
						count++;
						try {
						obj.wait();
					}
						catch(Exception e) {
						e.printStackTrace();
						}
					}
				}
					if(count%2!=0 && Thread.currentThread().getName().equals("Odd")&&count<=10) {
						synchronized(obj){
							System.out.println("Thread name:"+Thread.currentThread().getName()+"value:"+count);
							try {
							    Thread.sleep(2000);
							}
							catch(InterruptedException e) {
								e.printStackTrace();
							}
							count++;
							try {
							obj.notify();
							}
							catch(Exception e) {
								e.printStackTrace();
							}
						}
						
					}
			}
		}
}
public class evod{
		public static void main(String args[]) {
			Object lock=new Object();
			begin b1=new begin(lock);
			begin b2=new begin(lock);
		Thread t1=new Thread(b1);
			Thread t2=new Thread(b2);
			t1.setName("Even");
			t2.setName("Odd");
			t1.start();
			t2.start();
			//new Thread(b1,"Even").start();
			//new Thread(b2,"Odd").start();
		}
			
}
