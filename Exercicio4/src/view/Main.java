package view;

import controller.SapoThread;

public class Main {
	public static void main(String[] args) {
		int num = 0;
	      
		for (int i =0; i < 5; i++){
	    	num++;
	      	SapoThread t = new SapoThread(num);
	    	t.start();
		}
	}
}
