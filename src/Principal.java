
public class Principal {
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setRua("Rua Ariston, 20");
		endereco.setBairro("Vila Maria");
		endereco.setCep("03021-000");
		endereco.setEstado("SP");
		
		Cliente cliente = new Cliente();
		cliente.setCpf("123456");
		cliente.setNome("Katucha");
		cliente.setSobrenome("Ligabue");
		cliente.setEndereco(endereco);
		
		Conta conta = new Conta();
		conta.setNumero(123456789);
		conta.setLimite(2000);
		conta.setSaldo(398);
		conta.setTitular(cliente);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getTitular().getCpf());
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getSobrenome());
		System.out.println(conta.getTitular().getEndereco().getRua());
		System.out.println(conta.getTitular().getEndereco().getBairro());
		System.out.println(conta.getTitular().getEndereco().getCep());
		System.out.println(conta.getTitular().getEndereco().getEstado());
	}
}
