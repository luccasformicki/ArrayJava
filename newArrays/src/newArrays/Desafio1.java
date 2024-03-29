package newArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import Entidades.EntidadeDesafio1;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bem Vindo á pousada X, temos 10 quartos disponivéis para alugar!");
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		while(n > 10 || n < 1) {
			System.out.println("A Quantidade de quartos maximos disponiveis são 10, e o minimo é 1. Tente novamente! ");
			System.out.print("Quantos Quartos serão alugados? ");
			n = sc.nextInt();
		}
		
		
		EntidadeDesafio1 [] array = new EntidadeDesafio1 [n];
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Inqulino " + (i +1) + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Numero do quarto: ");
			int numero = sc.nextInt();
			array [i] = new EntidadeDesafio1 (nome, email, numero);
		}
		
		Arrays.sort(array, Comparator.comparingInt(EntidadeDesafio1::getQuarto));

		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < n; i++) {
		    EntidadeDesafio1 fulano = array[i];
		    System.out.println(fulano.getQuarto() + ": " + fulano.getName() + ", " + fulano.getEmail());
		}
		
		
		sc.close();

	}

}
