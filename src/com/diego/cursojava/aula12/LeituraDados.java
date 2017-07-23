package com.diego.cursojava.aula12;

import java.util.Scanner;

public class LeituraDados {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite seu nome Completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("O nome que você digitou foi: " + nomeCompleto);
	}

}
