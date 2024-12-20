package threads;

public class run{
	public static void main(String args[]) throws InterruptedException
	{
		operation op1=new operation();
		operation op2=new operation();
		operation op3=new operation();
		Thread t1=new Thread(op1);
	    Thread t2=new Thread(op2);
		Thread t3=new Thread(op3);
		t1.setName("add");
		t2.setName("print");
	    t3.setName("bank");
		t1.start();
		t2.start();
		t3.start();
	}
}
