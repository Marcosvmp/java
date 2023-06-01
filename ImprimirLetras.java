package Controle;

import java.util.Scanner;

public class ImprimirLetras {public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Digite uma palavra: ");
	String palavra =entrada.next();
	palavra =palavra.replace("","\n");
	
	System.out.print(palavra);
		
	


	entrada.close();

}
	
	
	
	
	
	
	
	
	
	
	
	
}

