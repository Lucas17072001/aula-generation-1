package exs_poo;

public class Patinete {
	//declarando os atribs da class
	private String modelo;
	private String cor;
	private String material;
	
	
	//construtor
	public Patinete(String modelo, String cor, String material) {
		this.modelo = modelo;
		this.cor = cor;
		this.material = material;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void mostraPatinete()
	{
		System.out.printf("Modelo: %s\nCor: %s\nMaterial: %s",modelo, cor, material);
	}
}
