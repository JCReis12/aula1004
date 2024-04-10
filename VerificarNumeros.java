package aula1004;

import java.util.Scanner;
public class VerificarNumeros {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		System.out.print("Escolha um número entre 1 e 3: ");
		int n = jc.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("O número escolhido foi 1");
			break;
		case 2:
			System.out.println("O número escolhido foi 2");
			break;
		case 3:
			System.out.println("O número escolhido foi 3");
			break;
		default:
			System.out.println("O número escolhido é inválido");
		}
		

	}

}
