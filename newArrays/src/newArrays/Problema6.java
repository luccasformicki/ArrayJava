package newArrays;

import java.util.Scanner;

public class Problema6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos valores cada Vetor vai ter? ");
		int n = sc.nextInt();
		
		int [] arrayA = new int [n];
		int [] arrayB = new int [n];
		
		System.out.println("Digite os valores do Vetor A");
		for (int i = 0; i < arrayA.length; i++) {
			arrayA [i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do Vetor B");
		for (int i = 0; i < arrayB.length; i++) {
			arrayB [i] = sc.nextInt();
		}
		
		System.out.println("Resultado Dos vetores: ");
		int soma =0;
		for (int i =0; i < arrayA.length; i++) {
			soma = arrayA [i] + arrayB [i];
			System.out.println(soma);
		}
		sc.close();

	}

}
