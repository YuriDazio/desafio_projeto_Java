
public abstract class conta implements iConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	




	public conta() {
		this.agencia = conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	

	

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	public void transferir(double valor, conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	

	public  int getAgencia() {
		return agencia;
	}
	public  int getConta() {
		return numero;
	}
	public  double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfoComum() {
		System.out.printf("Agencia: %d", this.agencia);
		System.out.printf("numero: %d", this.numero);
		System.out.printf("saldo: %.2f", this.saldo);
	}


	

}
