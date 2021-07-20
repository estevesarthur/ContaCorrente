
public class Conta {
	private int numero;
	private double saldo;
	private double limite;
	private Cliente Titular;
	
	/*// construtor via botao direito source
	public Conta(int numero, double saldo, double limite, Cliente titular) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		Titular = titular;
	}
	*/
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Cliente getTitular() {
		return Titular;
	}
	public void setTitular(Cliente titular) {
		Titular = titular;
	}
	
	
}
