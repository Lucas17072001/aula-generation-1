package loops;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade=0,x,menos21=0,mais50=0;
		
		while(idade!=-99)
		{
			System.out.println("Entre com a idade ou digite '-99' para sair: ");	
			idade = ler.nextInt();
			if(idade<21 && idade!=-99)
			{
				menos21++;
			}
			else if(idade>50)
			{
				mais50++;
			}
		}
		System.out.printf("Pessoas com menos de 21: %d",menos21);
		System.out.printf("\nPessoas com mais de 50: %d",mais50);
	}

}
