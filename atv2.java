package aula1004;

import java.util.Scanner;
public class atv2 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		System.out.print("Informe um valor: ");
		double a = jc.nextDouble();
		
		String msg = (a % 5 == 0) ? " é multiplo de 5" : " não é multiplo de 5";
		System.out.println("O número "+ a+ msg);
		
	}

}
