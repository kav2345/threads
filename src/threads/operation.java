package threads;

import java.util.InputMismatchException;
import java.util.Scanner;

public class operation implements Runnable {
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("print")) {
		print();		
		}
		else {
			bank();
		}
	}
	public void add() {
		try {
			Scanner sc=new Scanner(System.in);
		    System.out.println("task 1:addition operation started");
			System.out.println("enter the first number");
			int num1=sc.nextInt();
			System.out.println("enter the second number");
			int num2=sc.nextInt();
			int res=num1+num2;
			System.out.println("result is:"+res);
			System.out.println("task 1:addition operation completed");
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
	}
	public void print() {
		try {
			System.out.println("task 2:printing operation started");
			for(int i=0;i<5;i++) {
				System.out.println("kavya ");
				Thread.sleep(2000);
			}
			System.out.println("task 2:printing operation completed");
		}
		catch(InterruptedException e) {
			e.printStackTrace();	
		}
	}
	public void bank() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("task 3:banking operation started");
			System.out.println("enter account number");
			int acc=sc.nextInt();
			System.out.println("enter the pincode");
			int pin=sc.nextInt();
			System.out.println("account details recorded");
			System.out.println("task 3:banking operation completed");
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
	}

}
