package loops;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num,soma=0;
		
		do
		{
			System.out.println("Digite um n�mero");
			num = ler.nextInt();
			soma+=num;
		}
		while(num!=0);
		
		System.out.printf("Soma dos n�meros digitados: %d",soma);
	}

}
