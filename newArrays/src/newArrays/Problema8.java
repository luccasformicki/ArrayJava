package newArrays;

import java.util.Locale;
import java.util.Scanner;

public class Problema8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int [] array = new int [n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite o numero: ");
			array [i] = sc.nextInt();
		}
		
		int soma = 0;
		int quantidade = 0;
		for (int i = 0; i < array.length; i++) {
			if (array [i] % 2 ==0) {
				soma += array [i];
				quantidade ++;
			}
		}
		
		double mediaPares = (double) soma / quantidade;
		
		if (quantidade >= 1) {
			System.out.printf("Media dos pares = %.1f%n", mediaPares);
		}else {
			System.out.println("Nenhum numero Par!");
		}
		
		
		sc.close();

	}

}
