package exs_poo;

public class ex6_main {

	public static void main(String[] args) {
		Conta conta1 = new Conta(1234, 1, 100, 500.00,"teste");
		conta1.mostraConta();
		conta1.deposito(500);
		System.out.println("\n\nDEPOIS DO DEP�SITO \n");
		conta1.mostraConta();
		conta1.saque(100);
		System.out.println("\n\nDEPOIS DO SAQUE \n");
		conta1.mostraConta();
		
	}

}
