package Controle;

import java.util.Scanner;

public class DEsafioWhile2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double total = 0;
		double nota = 0;
		int contador = 0;
		double media = 0;

		while (nota != -1) {
			System.out.println("digite uma nota OU -1 para sair: ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				contador++;

			} else if (nota != -1) {
				System.out.println("nota invalida! ");
			}
		}
		media = total / contador;
		System.out.println("A media e:" + media);
		
		entrada.close();

	}

}
