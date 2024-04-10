package aula1004;

import java.util.Scanner;
public class atv3 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		System.out.println("Quantos anos de trabalho você tem: ");
		int tp = jc.nextInt();
		
		String msg = tp <= 3 ? "Seu bônus salarial é de 5%" : "Seu bônus salarial é de 7%";
		System.out.println(msg);
	}

}
