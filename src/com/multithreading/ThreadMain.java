package com.multithreading;

public class ThreadMain extends Thread{
	public void run()
	{
		System.out.println("concurrent thread started running..");
	}

	public static void main(String[] args) {
		ThreadMain mt = new  ThreadMain();
		mt.start();

	}

}
