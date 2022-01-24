package com.yamaha.assignment7.Question1;


class MyThread implements Runnable{
	Thread thread;
	
	public MyThread(String msg) {
		thread = new Thread(this,msg);
	}
	
	public void run() {
		int i = 0;
		while(i<=100) {
			System.out.println("Thread: "+thread.getName()+" prints: "+i);
			i++;
		}
	}
	
}

public class Main {
	public static void main(String[] args) {
		MyThread mythread = new MyThread("1");
		MyThread mythread2 = new MyThread("2");
		mythread.thread.start();
		mythread2.thread.start();
	}
}
