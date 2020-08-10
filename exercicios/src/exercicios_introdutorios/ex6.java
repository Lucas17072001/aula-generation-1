package exercicios_introdutorios;
/* Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2),
 * escreva a distância entre eles.
 * A fórmula que efetua tal cálculo é: d = √(x2-x1)² + (y2-y1)²  */

import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		double x1,x2,y1,y2,d;
		Scanner ler = new Scanner(System.in);
		System.out.println("Defina o ponto 1 digitando os 2 valores: ");
		x1 = ler.nextDouble();
		x2 = ler.nextDouble();
		System.out.println("Defina o ponto 2 digitando os 2 valores: ");
	    y1 = ler.nextDouble();
	    y2 = ler.nextDouble();
	    
	    d = ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)); 
	    d = Math.sqrt(d);
	    System.out.println("A distancia é " + d);
	}

}
