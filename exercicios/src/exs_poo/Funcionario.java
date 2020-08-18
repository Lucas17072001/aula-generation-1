package exs_poo;

public class Funcionario {
		// declarando atributos da class
		protected String nome;
		private String sbnome;
		private int idade;
		private String cargo;

		// construtor
		public Funcionario(String nome, String sbnome, int idade, String cargo) {
			super();
			this.nome = nome;
			this.sbnome = sbnome;
			this.idade = idade;
			this.cargo = cargo;
		}

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

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		
		public void mostrarFunc()
		{
			System.out.printf("Nome completo: %s %s\nIdade: %d\nCargo: %s",nome,sbnome,idade,cargo);
		}
}
