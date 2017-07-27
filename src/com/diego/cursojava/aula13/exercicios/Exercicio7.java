package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tamanho de um lado do quadrado em CM: ");
		float lado = scan.nextFloat();
		
		float areaQuadrado =  lado * lado;
		float areaDobroQuadrado =  areaQuadrado * 2;
		System.out.println("\nO valor do dobro da área é: " + areaDobroQuadrado + "cm");


	}

}
