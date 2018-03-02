package Ex3;

public class contaMain {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setNome("Robson");
		conta.setNumero(123);
		conta.setSaldo(123.123);
		System.out.print("Titular da conta "+conta.getNome()+"\nConta numero "+conta.getNumero()+"\nSaldo "+conta.getSaldo());
	}

}
