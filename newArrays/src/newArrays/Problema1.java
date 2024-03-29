package newArrays;

import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai Digiat?");
		int n = sc.nextInt();
		
		while ( n > 10 || n < 1) {
			System.out.print("O número máximo suportado é 10, e o minimo é 1. Tente novamente");
			n = sc.nextInt();
		}
		
		int [] array = new int [n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite o Numero " + (i) + ": ");
			array [i] = sc.nextInt();
		}
		
		System.out.println("Numeros Negativos:");
		for (int i = 0; i < array.length; i++) {
			if (array [i] < 0) {
				System.out.println(array [i]);
			}
		}
		
		sc.close();
	}

}
