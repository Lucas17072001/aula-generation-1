package arrays;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vet[] = new int[6],linha, somapares=0,contimp=0;
		
		for(linha = 0;linha<6;linha++)
		{
			System.out.println("Digite um número");
			vet[linha]= ler.nextInt();
			if(vet[linha]%2==0)
			{	
				System.out.println("O nº "+vet[linha]+" é par");
				somapares += vet[linha];
			}
			else
			{
				System.out.println("O nº "+vet[linha]+" é ímpar");
				contimp++;
			}
		}
		
		System.out.println("Soma dos pares: "+somapares);
		System.out.println("Quantos ímpares: "+contimp);
		
	}

}
