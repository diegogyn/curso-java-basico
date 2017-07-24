package com.diego.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {

		int resultado = 2 + 2;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado % 2;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);

		
		String primeiroNome = "Primeira parte do nome";
		String segundoNome = " segunda parte concatenação de string";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);

	}

}
