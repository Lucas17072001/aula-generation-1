package exs_polimorfismo_collections;

public class Cachorro extends Animal {
	private String latido;

	public Cachorro(String nome, int idade,String latido) {
		super(nome, idade );
		this.latido = latido;
	}

	public String getLatido() {
		return "AU AU";
	}

	public void setLatido(String latido) {
		this.latido = latido;
	}

	public String emitirSom() {
		return "Nome: " + super.getNome() + " emite o " + this.getLatido();
	}

}
