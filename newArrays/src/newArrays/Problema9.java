package newArrays;

import java.util.Scanner;

import Entidades.EntidadeProblema9;

public class Problema9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas Você vai digitar?");
		int n = sc.nextInt();
		
		EntidadeProblema9 [] array = new EntidadeProblema9 [n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			array [i] = new EntidadeProblema9 (name, idade);
		}
		
		EntidadeProblema9 maisVelho = array[0]; 

		for (int i = 1; i < array.length; i++) {
		    EntidadeProblema9 fulano = array[i];
		    if (fulano.getIdade() > maisVelho.getIdade()) {
		        maisVelho = fulano; 
		    }
		}

		System.out.println("A pessoa mais velha é: " + maisVelho.getName() + " com " + maisVelho.getIdade() + " anos.");


		sc.close();

	}

}
