package controller;

public class ThreadSomaController extends Thread {
	private int[] vetor;
	private int indice;
	
	public ThreadSomaController(int[] vetor, int indice) {
		this.vetor = vetor;
		this.indice = indice;
	}

	public void run() {
		calc();
	}
	
	private void calc() {
		int soma = 0;
		
		for(int i = 0; i < vetor.length-1; i++) {
			soma += vetor[i];
		}
		
		System.out.println("O Total da soma dos valores da " + (indice+1) + "a linha da matriz é de: " + soma + ".");
	}
}
