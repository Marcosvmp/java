package Controle;

import java.util.Scanner;

public class WhilePequenoDesafio {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String valor ="";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("voce diz: ");
			valor = entrada.nextLine();
		}
			
		
		
		
		
		
		
		entrada.close();
		
		
		
	}

}
