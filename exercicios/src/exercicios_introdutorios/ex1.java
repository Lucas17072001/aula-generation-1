package exercicios_introdutorios;

/*Faça um sistema que leia a idade de uma pessoa 
 * expressa em anos, meses e dias e mostre-a expressa apenas em dias. */

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		int anos, meses,dias,res;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual sua idade em anos, meses e dias(respectivamente)? ");
		anos = ler.nextInt();
		meses = ler.nextInt();
		dias = ler.nextInt();
		
		res = ((anos*365)+(meses*30)+dias);
		System.out.println("Sua idade em dias: "+res);
	}

}
