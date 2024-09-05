/*
 1) Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console o seu número (TID).
 */

package view;

import controller.ThreadId;

public class Main {

public static void main(String[] args){
		
		for(int i = 0; i < 5; i++){
			ThreadId t = new ThreadId();
			t.start();
		}
		
	}

}
