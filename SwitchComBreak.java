package Controle;

import java.util.Scanner;

public class SwitchComBreak {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
		System.out.println("informe a nota ");
		int nota = entrada.nextInt(); 
		
		
		switch (nota) {
		case 10: case 9:
			System.out.println("conceito: A");
			break;
		case 8: case 7:
			System.out.println("conceito: B" );
			break;
		case 6: case 5: 
			System.out.println("conceito:C ");
			break;
		case 4:	case 3:
			System.out.println("conceito D");
			break;
		case 2: case 1:
			System.out.println("conceito E");
			break;
		default:
			System.out.println("conceito nao encotrado");
			break;
		}
	
	entrada.close();
	
}
}
