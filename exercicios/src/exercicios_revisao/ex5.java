package exercicios_revisao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double vetor[] = new double[5];
		int x, cod;
		
		for(x=0;x<5;x++)
		{
			System.out.println("Digite um n�mero:");
			vetor[x]=ler.nextDouble();
		}
		
		System.out.println("Digite um n�mero pro c�digo:");
		cod = ler.nextInt();
		
		switch (cod) {
		case 1:
			for(x=0;x<5;x++)
			{
				System.out.println(vetor[x]);
			}
			break;
		
		case 2:
			for(x=4;x>=0;x--)
			{
				System.out.println(vetor[x]);
			}
			break;
			
		default:
			System.out.println("C�digo inv�lido!!\nEscolha entre 1 e 2");
			break;
		}
		
	}

}
