package exercicios_introdutorios;
/* Fa�a um sistema que leia a idade de uma pessoa
 *  expressa em dias e mostre-a expressa em anos, meses e dias */

import java.util.Scanner;
public class ex2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, tdias;
		System.out.println("Qual sua idade em dias? ");
		tdias = ler.nextInt();
		
		anos = (tdias/365);
		tdias = (tdias%365); 
		meses = (tdias/30);
		tdias = (tdias%30);
		dias = tdias;

		System.out.println("Anos: "+anos +"\nMeses: "+meses +"\nDias: " +dias);
	}

}
