package newArrays;

import java.util.Locale;
import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qauntos números você vai digitar? ");
		int n = sc.nextInt();
		
		double [] array = new double [n];
		for ( int i = 0; i < array.length; i++) {
			System.out.print("Digite um numero: ");
			array [i] = sc.nextDouble();
		}
		
		double maior = array [0];
		int posicao = 0;
		for (int i = 1; i < array.length; i++) {
			if (array [i] > maior  ) {
				maior = array [i];
				posicao = i;
			}
		}
		System.out.println("Maior Valor = " + maior);
		System.out.println("A posição do Maior numero dentro do vetor é (o vetor comça a contar com 0) = " + posicao);
		
		sc.close();

	}

}
