package Controle;

import java.util.Scanner;

public class NumeroPositivo {public static void main(String[] args) {
	
	
	Scanner entrada = new Scanner(System.in);
	
	double totalNumeros =0;
	
	System.out.println("Digite um numero positivo caso contrario encerra operacao!!!");
	double numero = entrada.nextDouble();
	
	
	while(numero>=0) {
		totalNumeros += numero;
		System.out.println("Digite um numero positivo caso contrario encerra operacao!!! "
				+ "\n ate o momento seu total e " + totalNumeros);
		numero = entrada.nextDouble();
	}
	System.out.println("a soma dos numeros digitados e igual a " + totalNumeros);
	
	
	
	
	entrada.close();	
	
}

}



