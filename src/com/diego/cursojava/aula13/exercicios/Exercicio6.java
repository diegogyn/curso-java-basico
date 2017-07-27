package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo em CM: ");
		double raio = scan.nextDouble();
		
		double areaCirculo =  Math.PI * Math.pow(raio, 2);
		System.out.println("\nO valor da área em centimetros é: " + areaCirculo + "cm");
		
	}

}