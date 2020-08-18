package exs_poo;

public class Conta {
	//declarando atribs class
	private int agencia;
	private int tipo;
	private int conta;
	private double saldo;
	
	public Conta(int agencia, int tipo, int conta, double saldo) {
		this.agencia = agencia;
		this.tipo = tipo;
		this.conta = conta;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void mostraConta()
	{
		System.out.printf("Tipo: %d\nAgência: %d\nConta: %d\nSaldo: %2.2f",tipo,agencia,conta,saldo);
	}
	
	public void deposito(double novovalor)
	{
		this.saldo = saldo+novovalor;
	}
	
}
