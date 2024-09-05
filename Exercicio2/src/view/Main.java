/*
2) Fazer uma aplicação que insira números aleatórios em uma matriz 3 x 5 e tenha 3 chamadas de Threads, onde cada uma calcula a soma dos valores de cada linha, imprimindo a identificação da linha e o resultado da soma.
 */

package view;

import controller.SomaThread;

public class Main {
	public static void main(String[] args) {
		int m[][] = new int[3][5];

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                m[i][j]= (int)(Math.random() * 10) + 1;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
            SomaThread t = new SomaThread(m[i]);
            t.start();
        }
        System.out.println();

	}

}
