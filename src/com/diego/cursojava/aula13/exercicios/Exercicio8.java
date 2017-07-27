package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora: ");
		float ganhoHora = scan.nextFloat();
		System.out.println("Quantas horas você trabalhou esse mês: ");
		float horasTabalhadas = scan.nextFloat();
		
		float salario =  ganhoHora * horasTabalhadas;
		System.out.println("\nO seu salario é: " + salario);


	}

}
