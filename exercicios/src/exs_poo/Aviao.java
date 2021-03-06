package exs_poo;

public class Aviao {
	// declarando atributos da class
	private int cod;
	private String modelo;
	private int ano_fab;
	private double comprimento;

	// construtor
	public Aviao(int cod, String modelo, int ano_fab, double comprimento) {
		this.cod = cod;
		this.modelo = modelo;
		this.ano_fab = ano_fab;
		this.comprimento = comprimento;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno_fab() {
		return ano_fab;
	}

	public void setAno_fab(int ano_fab) {
		this.ano_fab = ano_fab;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public void mostrarAviao() {
		System.out.printf("O avi�o de c�digo %d de modelo %s foi fabricado no ano de %d e tem o comprimento de %2.2fm "
				,cod,modelo,ano_fab,comprimento);
	}
}
