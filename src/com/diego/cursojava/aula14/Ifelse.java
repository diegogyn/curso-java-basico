package com.diego.cursojava.aula14;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
/*		
		System.out.println("Digite sua idade:");
		
		double idade = scan.nextDouble();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		}	else { 			
			System.out.println("Você é menor de idade!");
		}
*/
		// <= 10 (barato)
		// 10 < valor < 15 (pedir desconto)
		// 15 <= valor (pesquise mais)
		// >= 17 (muito caro)
		
		System.out.println("Digite o valor:");
		
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Tá barato!");
		}	else if (valor > 10 && valor  < 15) { 			
			System.out.println("Peça um desconto");
		}	else if (valor <= 15) {
			System.out.println("Pesquise mais");
		}	else { 			
			System.out.println("Muito caro");
			}
		}
		
		
	}
