package controller;

public class ThreadSomaLinha extends Thread {

	private int linhaMat[];
	private int linha;
	
	public ThreadSomaLinha(int[] linhaMat, int linha) {
		this.linhaMat = linhaMat;
		this.linha = linha + 1;
	}
	
	@Override
	public void run() {
		somaLinha();
	}

	private void somaLinha() {
		int soma = 0;
		for (int i = 0; i < 5; i++) {
			soma = soma + linhaMat[i];
		}
		
		System.out.println("Soma da linha " + linha + ": " + soma);
		
	}
	
}
