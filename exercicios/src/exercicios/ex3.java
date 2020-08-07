package exercicios;
/*Faça um sistema que leia o tempo de duração de um evento 
 *em uma fábrica expressa em segundos e mostre-o expresso
 *em horas, minutos e segundos. */

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tempo_total,hora,min,seg;
		System.out.println("Informe a duração do evento em segundos ");
		tempo_total = ler.nextInt();
		
		hora = (tempo_total/3600);
		tempo_total = (tempo_total%3600);
		min = (tempo_total/60);
		tempo_total = (tempo_total%60);
		seg = tempo_total;
		
		System.out.println("Horas: "+hora+"\nMinutos: "+min+"\nSegundos:"+seg);

	}

}
