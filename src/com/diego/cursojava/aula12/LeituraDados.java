package com.diego.cursojava.aula12;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
/*		System.out.println("Digite seu nome Completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("O nome que você digitou foi: " + nomeCompleto);
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade e: " + idade);
*/		
		System.out.println("Digite seu primeiro nome, idade, altura e se tem cachorro");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		float altura = scan.nextFloat();
		boolean cachorro = scan.nextBoolean();
		
		System.out.println("Voce digitou os seguintes dados:");
		System.out.println("Nome:" + primeiroNome);
		System.out.println("Idade:" + idade);
		System.out.println("Altura" + altura);
		System.out.println("Tem cachorro:" + cachorro);

	}

}
