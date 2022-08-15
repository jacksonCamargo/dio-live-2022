
public abstract class Conta implements Iconta {
	protected static final int AGENCIA_PADRAO = 0001;

	protected int agencia;
	protected int numero;
	protected int saldo;
	protected Cliente cliente;

	public  Conta( Cliente  cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		int SEQUENCIAL = 1;
		this.numero = SEQUENCIAL ++;
		this.cliente = cliente; 
	}

	
	
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
		
	}
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}
	public void transferir(double valor, Iconta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
		}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: s%",this.cliente.getNome()));
		System.out.println(String.format("Agencia: d%",this.agencia));
		System.out.println(String.format("Numero: d%", this.numero));
		System.out.println(String.format("Saldo: 2f%", this.saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public int getSaldo() {
		return saldo;
	}
	
}
