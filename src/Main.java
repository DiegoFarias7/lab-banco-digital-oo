
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		Banco banco = new Banco();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.setNome("Banco do Brasil");
		banco.adicionarConta(poupanca);
		banco.adicionarConta(cc);

		banco.mostrar_contas();
	}

}
