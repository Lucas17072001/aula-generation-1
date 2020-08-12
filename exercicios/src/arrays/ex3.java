package arrays;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[3][3],linha,coluna,maiorq10=0;
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("Digite um número para inserir na matriz");
				matriz[linha][coluna]= ler.nextInt();
				if(matriz[linha][coluna]>10)
				{
					maiorq10++;
				}
			}
		}
		System.out.println("\n\n");
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t %d \t",matriz[linha][coluna]);
			}
			System.out.println();
		}
		
		System.out.println("\n\nMaiores que 10:" +maiorq10);
	}

}
