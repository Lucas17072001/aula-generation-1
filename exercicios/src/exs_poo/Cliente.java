package exs_poo;

public class Cliente {
	// declarando atributos da class
	private String nome;
	private String sbnome;
	private int idade;
	private double altura;

	// construtor
	public Cliente(String nome, String sbnome, int idade, double altura) {
		this.nome = nome;
		this.sbnome = sbnome;
		this.idade = idade;
		this.altura = altura;
	}

	// metodos da classe

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSbnome() {
		return sbnome;
	}

	public void setSbnome(String sbnome) {
		this.sbnome = sbnome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void mostrarCliente() {
		System.out.println(nome +" "+ sbnome + " tem " + idade + " anos e " + altura + " de altura");
	}

}
