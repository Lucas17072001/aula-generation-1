package laços_condicionais;

import java.util.*;
public class ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual a sua idade? ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade <=14)
		{
			System.out.println("Você é da categoria Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Você é da categoria Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Você é da categoria Adulto");
		}
		else
		{
			System.out.println("Idade inválida");
		}
	}

}
