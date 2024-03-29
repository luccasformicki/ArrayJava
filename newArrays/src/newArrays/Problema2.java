package newArrays;

import java.util.Locale;
import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		double [] array = new double [n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array [i] = sc.nextDouble();
			}
		
		System.out.println("VALORES = ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array [i] + " \n");
		}
		
		double soma = 0.0, media;
		for (int i = 0; i < array.length; i++) {
			soma += array [i];
		}
		
		media = soma / array.length;
		
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Média = %.2f%n", media);
		
		sc.close();

	}

}
