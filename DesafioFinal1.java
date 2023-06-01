package Controle;

import java.util.Scanner;

public class DesafioFinal1 {
	public static void main(String[] args) {
		
		
		Scanner entrada =new Scanner (System.in);

		System.out.println("digite um numero: ");
		int numero =entrada.nextInt();
		

		
		
		 
		if 	(numero<0 || numero >10) {
			System.out.println("numero invalido");
		}
		else if 	(numero % 2==0) {
			System.out.println("numero par!!!");
		}
		else if (numero % 2 == 1) {
			System.out.println("numero impar");
		}
		
		
		
		
		
		
		entrada.close();
		
		
		
		
		
		
	}

}
