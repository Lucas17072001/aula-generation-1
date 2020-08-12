package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double matrizA[][]=new double[2][2], matrizB[][]=new double[2][2], matrizC[][]=new double[2][2];
		int linha, coluna,op;
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("Digite um n�mero p/ inserir na matriz A");
				matrizA[linha][coluna]=ler.nextDouble();
				System.out.println("Digite um n�mero p/ inserir na matriz B");
				matrizB[linha][coluna]=ler.nextDouble();
				
			}
			
		}
		
		System.out.println("Digite qual opera��o quer realizar");
		System.out.println("1 -- Somar	2 -- Subtrair");
		System.out.println("3 -- Adicionar constante	4 -- Imprimir");
		System.out.println("0 -- Sair");
		op = ler.nextInt();
		
		while(op!=0)
		{
			switch (op) {
			case 1:
				//somar
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matrizC[linha][coluna] = matrizA[linha][coluna]+matrizB[linha][coluna];
					}
					
				}
				//mostrando resultado
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.printf("\t %2f \t",matrizC[linha][coluna]);
					}
					System.out.println();
				}
				break;
				
			case 2:
				//subtrair
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matrizC[linha][coluna] = matrizB[linha][coluna]-matrizA[linha][coluna];
					}
					
				}
				//mostrando resultado
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.printf("\t %2f \t",matrizC[linha][coluna]);
					}
					System.out.println();
				}
				break;
				
			case 3:
				//add const
				System.out.println("Digite um valor para a constante a ser adicionada");
				double valor = ler.nextDouble();
				
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						matrizA[linha][coluna]+=valor;
						matrizB[linha][coluna]+=valor;
					}
					
				}
				
				//mostrando resultado
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.printf("\t %2f \t",matrizA[linha][coluna]);
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println();
				
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.printf("\t %2f \t",matrizB[linha][coluna]);
					}
					System.out.println();
				}
				break;
				
			case 4:
				//imprimir
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.printf("\t %2f \t",matrizA[linha][coluna]);
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println();
				
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						System.out.printf("\t %2f \t",matrizB[linha][coluna]);
					}
					System.out.println();
				}
				break;
				

			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
			
			System.out.println("Digite qual opera��o quer realizar");
			System.out.println("1 -- Somar	2 -- Subtrair");
			System.out.println("3 -- Adicionar constante	4 -- Imprimir");
			System.out.println("0 -- Sair");
			op = ler.nextInt();
		}
				

	}
}
