package loops;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		int idade,sexo,op,x=1,calmas=0,o_calmas=0,m_nervs=0,h_agres=0,n_mais40=0,c_menos18=0;
		Scanner ler = new Scanner(System.in);
		
		while(x<=150)
		{
			System.out.println("Entre com a idade:");
			idade = ler.nextInt();
			System.out.println("Qual o sexo? \n1 -- feminino\n2 -- masculino\n3 -- outro:");
			sexo = ler.nextInt();
			System.out.println("Qual seu temperamento?\n1 -- calmo\n2 -- nervoso\n3 -- agressivo: :");
			op = ler.nextInt();
			
			if(op==1)
			{
				calmas++;
				if(sexo==3)
				{
					o_calmas++;
				}
				if(idade<18)
				{
					c_menos18++;
				}
			}
			if(sexo==2 && op==3)
			{
				h_agres++;
			}
			if(op==2)
			{
				if(sexo==1)
				{
					m_nervs++;
				}
				if(idade>40)
				{
					n_mais40++;
				}
			}
			x++;
		}
		
		System.out.printf("\nPessoas calmas: %d",calmas);
		System.out.printf("\nMulheres nervosas: %d",m_nervs);
		System.out.printf("\nHomens agressivos: %d",h_agres);
		System.out.printf("\nOutros calmos: %d",o_calmas);
		System.out.printf("\nNervosos com mais de 40 anos: %d",n_mais40);
		System.out.printf("\nCalmos com menos de 18 anos: %d",c_menos18);
		
		
		
		
	}

}
