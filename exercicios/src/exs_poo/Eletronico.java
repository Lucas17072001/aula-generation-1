package exs_poo;

public class Eletronico {
		// declarando atributos da class
		private int cod;
		private String tipo;
		private String modelo;
		private int ano_fab;
		private double peso;

		// construtor
		public Eletronico(int cod,String tipo, String modelo, int ano_fab, double peso) {
			this.cod = cod;
			this.tipo = tipo;
			this.modelo = modelo;
			this.ano_fab = ano_fab;
			this.peso = peso;
		}

		public int getCod() {
			return cod;
		}

		public void setCod(int cod) {
			this.cod = cod;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
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

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}
		
		public void mostrarEletro()
		{
			System.out.printf("Produto de código: %d\nTipo: %s\nModelo: %s\nAno Fabricação: %d\nPeso: %f",
					cod,tipo,modelo,ano_fab,peso);
		}
}
