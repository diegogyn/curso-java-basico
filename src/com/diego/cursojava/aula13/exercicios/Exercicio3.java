package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite outro número: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("\nO A soma dos números digitados é: " + resultado);
		
		
	}

}
