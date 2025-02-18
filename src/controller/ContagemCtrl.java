package controller;

public class ContagemCtrl {
	public ContagemCtrl() {
		super();
	}
	public static double Contagem (int[] vetor, int n, double total) {
		int i;
		total = System.nanoTime();
		for(i=0; i<=n; i++) {
			vetor[i] = vetor[i];
		}
		total = (System.nanoTime() - total);
		total = total/1000000000;
		return total;
	}
}
