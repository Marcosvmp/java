package Controle;

import java.util.Scanner;

public class MediaDesafio3 {
public static void main(String[] args) {
	 
	
	
	Scanner entrada =new Scanner(System.in);
	System.out.println("digite a primeira nota :");
	double nota1 = entrada.nextDouble();
	System.out.println("digite a segunda nota :");
	double nota2 = entrada.nextDouble();
	
	double media = (nota1 + nota2)/2;
	
	if (media>=7) {
		System.out.println("Sua media e: " + media + " aprovado!!! ");
	}else if (media<7 && media>=4)
		System.out.println("Sua media e: " + media + " recuperacao!!! ");
	else {
		System.out.println("Sua media e: " + media + " reprovado!!!");
	}
	
	
	
	
	
	
	entrada.close();
}
}
