package Ex4;

public class contaMain {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Conta conta1 = new Conta("Robson");
		
		/*
		 * Quando crio o construtor o sistema força
		 * a entrada de dados para que se tenha um parametro
		 */
		System.out.println(conta.getNome());
		System.out.println(conta1.getNome());

	}

}
