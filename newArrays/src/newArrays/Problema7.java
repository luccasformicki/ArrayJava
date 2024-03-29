package newArrays;

import java.util.Locale;
import java.util.Scanner;

public class Problema7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos Elementos o vetor vai ter? ");
		int n = sc.nextInt();
		
		double [] array = new double [n];
		for (int i =0; i < array.length; i++) {
			System.out.print("Digite o numero: ");
			array [i] = sc.nextDouble();
		}
		
		double soma = 0.0, media;
		for (int i =0; i < array.length; i++ ) {
			soma += array [i];
		}
		
		media = soma / array.length;
		System.out.println("Media do vetor = "+ media);
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < array.length; i++) {
			if (array [i] < media) {
				System.out.println(array [i]);
			}
		}
		
		
		sc.close();

	}

}
