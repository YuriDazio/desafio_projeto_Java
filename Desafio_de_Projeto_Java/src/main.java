
public class main {

	public static void main(String[] args) {
		conta cc = new contaCorrente();
		conta poupanca = new contaPoupanca();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
