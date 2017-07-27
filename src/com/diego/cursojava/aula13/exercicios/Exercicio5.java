package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a metragem: ");
		float metros = scan.nextFloat();
		
		float centimetros = metros * 100;
		System.out.println("\nO valor em centimetros é: " + centimetros + "cm");
		

	}

}
