package loops;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		int num,soma=0,cont=0;
		double media;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um n�mero:");
			num = ler.nextInt();
			if(num%3==0 && num!=0)
			{
				soma+=num;
				cont++;
			}
		}
		while(num!=0);
		media = soma/cont;
		
		System.out.printf("A m�dia dos m�ltiplos de 3 �: %2.2f",media);
	}

}
