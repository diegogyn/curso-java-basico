package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em graus ºC: ");
		double temperaturaC = scan.nextDouble();
		
		double temperaturaF = temperaturaC * 9 / 5 + 32;
		System.out.println("\nA temperautra em Farenheit é: " + temperaturaF);


	}

}
