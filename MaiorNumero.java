package Controle;

import java.util.Scanner;


public class MaiorNumero {
public static void main(String[] args) {
	
	double numeroFinal =0;
	int contador =1;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Digite o valor: ");
	double n1 = entrada.nextDouble();
	
	while(contador < 10) {
		if(n1 >= numeroFinal) {
			numeroFinal = n1;
			System.out.println("Digite o valor: ");
			n1 = entrada.nextDouble();
			contador++;
		}else if(n1 < numeroFinal) {
			System.out.println("Digite o valor: ");
			n1 = entrada.nextDouble();
			contador++;
		}
	}
	System.out.println("o maior valor digitado foi: " + numeroFinal);
	System.out.println("Fim!!! ");
	
	entrada.close();
	
	
	
	
}
}
