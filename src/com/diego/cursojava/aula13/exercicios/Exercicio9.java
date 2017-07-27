package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a temperatura em graus ºF: ");
		double temperaturaF = scan.nextDouble();
		
		double temperaturaC = 5 * (temperaturaF - 32) / 9;
		System.out.println("\nA temperautra em Celsius é: " + temperaturaC);

	}

}
