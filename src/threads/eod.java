package threads;

public class eod {
	public static void main(String args[]) {
		number n1=new number();
		number n2=new number();
		Thread t1=new Thread(n1);
		Thread t2=new Thread(n2);
		t1.setName("even");
		t2.setName("odd");
		t1.start();
		t2.start();
		
		
	}
}
