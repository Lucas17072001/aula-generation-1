package exs_heranca;

public class classe_main {

	public static void main(String[] args) {
		//Fornecedor joao = new Fornecedor("Jo�o", "Rua 9", "999999999", 50, 15);
		
		//joao.obterSaldo();
		
		//Empregado jonas = new Empregado("Jonas", "rua xx", "555555", 123, 1000, 20);
		//System.out.println(jonas.calcularSalario());
		
		//Pessoa joao = new Administrador("joao", "rua x", "333", 2132);
		Empregado jonas = new Empregado("jonas","rua x","3243232",231321,1000,0);
		
		System.out.println(jonas.calcularSalario());
		
	}

}
