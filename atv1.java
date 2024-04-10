package aula1004;

import java.util.Scanner;
public class atv1 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		System.out.print("Nota 1: ");
		double n1 = jc.nextDouble();
		System.out.print("Nota 2: ");
		double n2 = jc.nextDouble();
		System.out.print("Nota 3: ");
		double n3 = jc.nextDouble();
		System.out.print("Nota 4: ");
		double n4 = jc.nextDouble();
		
		double md = (n1+n2+n3+n4)/4;
		
		String msg = md >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(msg + ", sua média foi de "+md);
		
	}

}
