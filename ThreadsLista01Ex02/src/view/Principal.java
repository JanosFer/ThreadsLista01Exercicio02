package view;

import controller.ThreadSomaController;

public class Principal {
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][5];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = (int) ((Math.random() * 10) + 1);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			int[] vetor = matriz[i];
			
			ThreadSomaController t = new ThreadSomaController(vetor, i);
			t.start();
			
		}
	}
}
