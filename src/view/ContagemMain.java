package view;
import controller.ContagemCtrl;

public class ContagemMain {
	public static void main (String args[]) {
		
		int i; int[] vet = new int[100000];
		for (i=0;i<100000;i++) {
			vet[i] = i;
		}
		
		double total1 = ContagemCtrl.Contagem(vet, 999, 0);
		double total2 = ContagemCtrl.Contagem(vet, 9999, 0);
		double total3 = ContagemCtrl.Contagem(vet, 99999, 0);
		
		System.out.println("1000: " + total1 + "s, 10000: " + total2 + "s, 100000: " + total3 + " s.");
	}
}
