import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	private List<Cliente> clientes = new ArrayList<>();

	public void listaClientes() {
		System.out.println("Lista de Clientes:");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}
	}

	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
