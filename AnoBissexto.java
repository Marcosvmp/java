package Controle;

import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite o ano: ");
		int ano = entrada.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("O ano e bissexto!!! ");
		} else {
			System.out.println("O ano nao e bissexto!!! ");
		}

		entrada.close();

	}
}
