package laços_condicionais;

import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		
		System.out.println("Digite um número inteiro: ");
		a = ler.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		b = ler.nextInt();
		
		System.out.println("Digite um número inteiro: ");
		c = ler.nextInt();
		
		if(a<b)
		{
			if(b<c)
			{
				System.out.println(a+"\n"+b+"\n"+c);
			}
			else if(a<c)
			{
				System.out.println(a+"\n"+c+"\n"+b);
			}
			else
			{
				System.out.println(c+"\n"+a+"\n"+b);
			}
				
		}
		else if(b<c)
		{
			if(a<c)
			{
				System.out.println(b+"\n"+a+"\n"+c);
			}
			else
			{
				System.out.println(b+"\n"+c+"\n"+a);
			}
		}
		else
		{
			System.out.println(c+"\n"+b+"\n"+a);
		}
		
	}

}
