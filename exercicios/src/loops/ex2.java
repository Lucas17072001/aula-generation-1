package loops;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, num, contp=0, conti=0;
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite um número ");
			num = ler.nextInt();
			if(num%2==0)
			{
				contp++;
			}
			else
			{
				conti++;
			}
		}
		System.out.println("Quantidade de pares: "+contp);
		System.out.println("Quantidade de ímpares: "+conti);
	}

}
