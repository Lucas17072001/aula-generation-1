package exercicios_introdutorios;
//ex8
import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double custo;
				
		System.out.println("Digite o custo de f�brica do carro: ");
		custo = ler.nextDouble();
		
		custo = custo*1.73;
		
		System.out.println("O custo final do carro �: "+custo);
		
	}

}
