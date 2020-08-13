package exercicios_revisao;

public class ex4 {

	public static void main(String[] args) {
		int x;
		double soma,res=0,cima = 1, baixo = 1;
		for (x = 1; x <= 50; x++)
		{
			soma = cima/baixo;
			res = res + soma;
			cima += 2;
			baixo++;
		}
		System.out.printf("O resultado é: %2.2f",res);
	}

}
