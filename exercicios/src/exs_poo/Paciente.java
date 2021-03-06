package exs_poo;

public class Paciente {
	private int id;
	private String nome;
	private int idade;
	private char sexo;
	private String convenio;

	public Paciente(int id, String nome, int idade, char sexo, String convenio) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.convenio = convenio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public void mostraPaciente() 
	{
		System.out.printf("Paciente: %s\nID: %d\nIdade: %d\nSexo: %c\nConv�nio: %s",nome,id,idade,sexo,convenio );
	}

}
