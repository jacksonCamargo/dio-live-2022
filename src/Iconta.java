
public interface Iconta {
	
	void sacar(double valor);
		
	
	void depositar(double valor);
		
	
	void transferir(double valor , Iconta contaDestino);
	
	void imprimirExtrato();
}
