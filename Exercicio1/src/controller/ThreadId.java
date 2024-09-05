package controller;

public class ThreadId extends Thread{
	
	public ThreadId(){
		super();
	}
	
	@Override
	public void run(){
		int id = (int) threadId();
		System.out.println("#" + id);
	}
}
