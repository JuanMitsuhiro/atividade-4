package controller;

public class SomaThread extends Thread{
    private int vet[];

    public SomaThread(int[] vet){
        this.vet = vet;
    }

    @Override
    public void run(){
        int id = (int) threadId();
        int soma = 0;
        for (int i = 0; i < 5; i++){
            soma += vet[i];
        }
        System.out.println("#" + id + " = " + soma + "({" + vet[0] + ", "+ vet[1] + ", " + vet[2] + ", " + vet[3] + ", " + vet[4]+"})");
    }
}
