package aula1004;

import java.util.Scanner;
public class condic2 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		System.out.println("Informe o dia da semana");
		int dia = jc.nextInt();
		
		switch (dia) {
		case 1: 
			System.out.println("Domingo");
			break;
		case 2: 
			System.out.println("Segunda-feira");
			break;
		case 3: 
			System.out.println("Terça-feira");
			break;
		case 4: 
			System.out.println("Quarta-feira");
			break;
		case 5: 
			System.out.println("Quinta-feira");
			break;
		case 6: 
			System.out.println("Sexta-feira");
			break;
		case 7: 
			System.out.println("Sabado");
			break;
		default: 
			System.out.println("Dia da semana inválido");
		}

	}

}
