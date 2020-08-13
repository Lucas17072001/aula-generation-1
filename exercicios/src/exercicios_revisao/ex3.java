package exercicios_revisao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		int num, cont25=0, cont50=0, cont75=0, cont100=0;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		while(num>=0)
		{
			if(num>=0 && num<=25)
			{
				cont25++;
			}
			if(num>=26 && num<=50)
			{
				cont50++;
			}
			if(num>=51 && num<=75)
			{
				cont75++;
			}
			if(num>=76 && num<=100)
			{
				cont100++;
			}
			System.out.println("Digite um número: ");
			num = ler.nextInt();
		}
		System.out.println();
		System.out.println();
		System.out.println("Quantos entre 0 e 25:"+cont25);
		System.out.println("Quantos entre 26 e 50:"+cont50);
		System.out.println("Quantos entre 51 e 75:"+cont75);
		System.out.println("Quantos entre 76 e 100:"+cont100);
	}

}
