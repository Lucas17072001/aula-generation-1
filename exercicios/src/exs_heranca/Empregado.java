package exs_heranca;

import java.util.Scanner;

public class Empregado extends Pessoa {
	Scanner ler = new Scanner(System.in);
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = setImposto();
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public double setImposto() {
		System.out.println("Qual o imposto? ");
		this.imposto = ler.nextDouble();
		return this.imposto;
	}
	
	public double calcularSalario() {
		double sal = this.salarioBase * (1-(this.imposto/100));
		return sal;
	}
	
	
	
}
