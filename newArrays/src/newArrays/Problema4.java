package newArrays;

import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int [] array = new int [n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite o numero: ");
			array [i] = sc.nextInt();
		}
		
		int quantidade = 0;
		System.out.println("Numeros pares: ");
		for(int i = 0; i < array.length; i++) {
			if (array [i] % 2 == 0) {
				System.out.print( array [i] + " " + "\n");
				quantidade++;
			}
		}	
		
		System.out.println("Qauntidade de pares = " + quantidade);
		
		sc.close();

	}

}
