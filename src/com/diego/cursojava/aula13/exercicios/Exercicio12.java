package com.diego.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a altura");
        double altura = scan.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println("O peso ideal é: " + pesoIdeal);

	}

}
