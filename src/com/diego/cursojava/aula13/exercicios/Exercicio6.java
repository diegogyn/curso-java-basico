package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo em CM: ");
		float raio = scan.nextFloat();
		
		double areaCirculo =  Math.PI * (raio * raio);
		System.out.println("\nO valor da área em centimetros é: " + areaCirculo + "cm");
		
	}

}