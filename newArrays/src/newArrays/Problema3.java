package newArrays;

import java.util.Locale;
import java.util.Scanner;

import Entidades.EntidadeProblema3;

public class Problema3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas Pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		EntidadeProblema3 [] array = new EntidadeProblema3 [n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Dados da pessoa " + (i + 1) + ": ");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			array [i] = new EntidadeProblema3 (nome, idade, altura);
		}
		
		double soma = 0.0, mediaAltura, porcentagemIdade;
		for (EntidadeProblema3 fulano : array)  {
			soma += fulano.getAltura();
		}
		
		int idade = 0;
		for (EntidadeProblema3 fulano : array) {
			if (fulano.getIdade() < 16) {
				idade ++;
			}
		}
			
		mediaAltura = soma / n;
		porcentagemIdade = ((double) idade * 100.0 ) / n;
		
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		System.out.printf("Pessoas Com menos de 16 anos: %.1f%%\n", porcentagemIdade);
		for (EntidadeProblema3 fulano : array) {
			if (fulano.getIdade() <16) {
				System.out.println(fulano.getName());
			}
		}
		
		
		
		sc.close();
	}

}
