package exs_polimorfismo_collections;

public class Preguica extends Animal {
	private String barulho;

	public Preguica(String nome, int idade, String barulho) {
		super(nome, idade);
		this.barulho = barulho;
	}

	public String getBarulho() {
		return barulho;
	}

	public void setBarulho(String barulho) {
		this.barulho = barulho;
	}

	public String emitirSom() {
		return "Nome: " + super.getNome() + " emite o som" + this.getBarulho();
	}
}
