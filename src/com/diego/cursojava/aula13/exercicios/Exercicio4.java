package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		int nota1 = scan.nextInt();
		System.out.println("Digite a nota do segundo bimestre: ");
		int nota2 = scan.nextInt();
		System.out.println("Digite a nota do terceiro bimestre: ");
		int nota3 = scan.nextInt();
		System.out.println("Digite a nota do quarto bimestre: ");
		int nota4 = scan.nextInt();
		
		int media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("\nO A média dos quatro bimestres é: " + media);
		

	}

}
