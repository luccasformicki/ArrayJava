package newArrays;

import java.util.Locale;
import java.util.Scanner;

import Entidades.EntidadeProblema10;

public class problema10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		EntidadeProblema10 [] array = new EntidadeProblema10 [n];
		for (int i = 0; i < array.length; i ++) {
			System.out.println("Digite Nome, Primeira nota e segunda nota do " + (i + 1) + " Aluno: ");
			String nome = sc.next();
			double notap = sc.nextDouble();
			double notas = sc.nextDouble();
			array [i] = new EntidadeProblema10 (nome, notap, notas);
		}
		
		System.out.println("Alunos Aprovados: ");
		for (EntidadeProblema10 aluno : array) {
			double media = (aluno.getpNota() + aluno.getsNota()) / 2;
			if (media >= 6) {
				System.out.println(aluno.getName());
			}
		}
		
		
		sc.close();

	}

}
