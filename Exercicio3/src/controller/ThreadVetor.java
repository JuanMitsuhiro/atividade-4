package controller;

public class ThreadVetor extends Thread{
    private int valor;
    private int vet[];

    public ThreadVetor(int valor, int[] vet){
        this.valor = valor;
        this.vet = vet;
    }

    @Override
    public void run(){
        Calcula();
    }

    @SuppressWarnings("unused")
	private void Calcula(){
        if (valor % 2 == 0){
            double tempoInicial = System.nanoTime();
            for(int i = 0 ; i < vet.length; i++){
                int teste = vet[i];
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = tempoFinal - tempoInicial;
            tempoTotal = tempoTotal/Math.pow(10, 9);
            System.out.println("PAR = " + tempoTotal + "s");
        }else {
            double tempoInicial = System.nanoTime();
            for (int numVet : vet){
                int teste = numVet;
            }
            double tempoFinal = System.nanoTime();
            double tempoTotal = tempoFinal - tempoInicial;
            tempoTotal = tempoTotal/Math.pow(10, 9);
            System.out.println("IMPAR = " + tempoTotal + "s");
        }
    }
}