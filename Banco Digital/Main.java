
public class Main {

	public static void main(String[] args) {
		Banco bancoFrancine = new Banco();
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setCpf("08498437434");
		bancoFrancine.adicionarCliente(venilton);
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Cliente francine = new Cliente(); //Novo cliente
		francine.setNome("Francine");
		francine.setCpf("08007482343");
		bancoFrancine.adicionarCliente(francine);
		
		Conta ccc = new ContaCorrente(francine);
		Conta poupancaa = new ContaPoupanca(francine);

		ccc.depositar(100);
		ccc.transferir(100, poupanca);
		
		ccc.imprimirExtrato();
		poupancaa.imprimirExtrato();

		bancoFrancine.listaClientes();  //Funcionalidade para mostrar os clientes
	}
}
