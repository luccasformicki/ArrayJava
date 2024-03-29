package newArrays;

import java.util.Locale;
import java.util.Scanner;

import Entidades.EntidadeProblema11;

public class Problema11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas Pessoas serão digitadas? ");
		int n = sc.nextInt();

		EntidadeProblema11[] array = new EntidadeProblema11[n];
		for (int i = 0; i < array.length; i++) {
		    System.out.print("Altura da " + (i + 1) + " Pessoa: ");
		    double altura = sc.nextDouble();
		    System.out.print("Genero da " + (i + 1) + " Pessoa: ");
		    String sexo = sc.next();
		    array[i] = new EntidadeProblema11(altura, sexo);
		}

		EntidadeProblema11 maisBaixo = array[0];
		EntidadeProblema11 maisAlto = array[0];

		for (int i = 1; i < array.length; i++) {
		    EntidadeProblema11 fulano = array[i];
		    if (fulano.getAltura() > maisBaixo.getAltura()) {
		        maisBaixo = fulano;
		    }
		    if (fulano.getAltura() < maisAlto.getAltura()) {
		        maisAlto = fulano;
		    }
		}

		double somaAlturaMulheres = 0.0;
		int mulher = 0, homem = 0;
		for (EntidadeProblema11 fulano : array) {
		    if (fulano.getSexo().equalsIgnoreCase("F")) {
		        somaAlturaMulheres += fulano.getAltura();
		        mulher++;
		    } else {
		        homem++;
		    }
		}

		double mediaMulheres = 0.0;
		if (mulher > 0) {
		    mediaMulheres = somaAlturaMulheres / mulher;
		}

		System.out.printf("Menor Altura = %.2f%n", maisAlto.getAltura());
		System.out.printf("Maior Altura = %.2f%n", maisBaixo.getAltura());
		System.out.printf("Média da Altura das mulheres = %.2f%n", mediaMulheres);
		System.out.println("Número de Homens = " + homem);
		
		
		sc.close();

	}

}
