package la�os_condicionais;


import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,c,maior=0;
		
		System.out.println("Digite um n�mero inteiro: ");
		a = ler.nextInt();
		
		System.out.println("Digite um n�mero inteiro: ");
		b = ler.nextInt();
		
		System.out.println("Digite um n�mero inteiro: ");
		c = ler.nextInt();
		
		if(a>b && a>c)
		{
			maior = a;
		}
		else if(b>a && b>c)
		{
			maior = b;
		}
		else if(c>a && c>b)
		{
			maior = c;
		}
		
		System.out.printf("O maior n�mero � %d",maior);
	}

}
