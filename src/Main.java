
public class Main {
	
	public static void main(String[] args) {
		
		Cliente jackson = new Cliente();
		jackson.setNome("Camargo");
		
		Iconta cc = new ContaCorrente(jackson);
		cc.depositar(100);
		
		
		//Iconta poupanca = (Iconta) new ContaPoupanca();
		//cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
		
		System.out.println();
		
	}

}
