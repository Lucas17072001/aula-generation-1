package exercicios;

/* Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. */
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n1,n2,n3,media;
		
		System.out.println("Digite as 3 notas respectivamente");
		n1=ler.nextDouble();
		n2=ler.nextDouble();
		n3=ler.nextDouble();
		media = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.println("A m�dia do aluno foi " +media);
	}

}
