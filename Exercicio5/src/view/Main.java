package view;

import controller.PingThread;

public class Main {
	public static void main(String[] args) {
		String[] comando = {"www.uol.com.br", "www.terra.com.br","www.google.com.br"};
		String[] nome = {"UOL", "Terra","Google"};
		
		for (int i = 0; i < 3; i++){
			PingThread t = new PingThread(comando[i], nome[i]);
			t.start();
		}
	}
}
