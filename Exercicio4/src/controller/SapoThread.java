package controller;

public class SapoThread extends Thread{
	private int num;
	private static int colocacao = 0;
	   
	public SapoThread(int num){
		this.num = num;
	}
	   
	@Override
	public void run(){
		int salto = 0;
		int saltoTotal = 0;
	    
		do {
	    	salto = (int) (Math.random()* 3) + 1;
	    	saltoTotal += salto;
			System.out.println("Sapo " + num + " saltou " + salto +" (T: " + saltoTotal + ")");
			
			try {
                Thread.sleep(650);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			
	    } while (saltoTotal < 20);
			System.out.println("Sapo " + num + " chegou em " + ++colocacao + " lugar!");
			salto = colocacao;
			
	    	try {
                Thread.sleep(3500);
                System.out.println(salto + "º Sapo " + num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

	}
	   
}