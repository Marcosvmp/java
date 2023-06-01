package Controle;

import java.util.Scanner;

public class jogoAdivinhaNumero {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero de 0 a 100!");
		int numero = entrada.nextInt();
		int contador = 1;
		int numeroCerto = 50;

		while (numero != numeroCerto && contador < 10) {
			if (numero < numeroCerto) {
				System.out.println("numero digitado e menor que o numero guardado " + contador + "/10 chances");
				contador++;
				numero = entrada.nextInt();
			} else if (numero > numeroCerto) {
				System.out.println("numero digitado e maior que numero guardado " + contador + "/10 chances");
				contador++;
				numero = entrada.nextInt();
			}
		}
		 if(numero == numeroCerto) {
				System.out.println("parabens vc acertou!");
		 }
				System.out.println(contador +"/10 Fim!" );

		entrada.close();

	}

}
