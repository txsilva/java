//Classe ContaCorrente.java

public class ContaCorrente{
	private float saldo = 0;
	private String titular;
	
	public String sacar(float valor){
		this.saldo -= valor;
		return "Saque realizado com sucesso!";
	}

	public String depositar(float valor){
		this.saldo = this.saldo + valor;
		return "Deposito realizado com sucesso!";
	}

	public static void main(String[] args){
		System.out.println(ContaCorrente.saldo);
	}
}


