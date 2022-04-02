/* Primeiro Objeto  do ByteBank Conta.java */
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
}

/* Classe CriaConta CriaConta.java*/

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("R$ " +primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("R$ " +primeiraConta.saldo);

	}
}


/* Criando Múltiplas Contas */
public class CriaConta {

	public static void main(String[] args) {

		/* Criando Primeira Conta */
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo da primeira Conta " + "R$ " +primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Saldo da primeira Conta " + "R$ " +primeiraConta.saldo);

		/* Criando Segunda Conta */
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("Saldo da Segunda Conta " + "R$ " + segundaConta.saldo);
		segundaConta.saldo += 100;
		System.out.println("Saldo da Segunda Conta " + "R$ " + segundaConta.saldo);
	}
}

/* Primeiro Método Contas.java */

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;


	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Valor insuficiente");
			return false;
		}

	}

  public boolean transferir(double valor, Conta destino) {

		if(this.saldo >= valor ) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		System.out.println("Saldo Insuficiente");
		return false;
	}
}


/* Testando Método */



public class testaMetodo {

	public static void main(String[] args) {
		Conta contaDoAndre = new Conta();
		contaDoAndre.saldo = 100;
		contaDoAndre.deposita(50);
		System.out.println(contaDoAndre.saldo);
		contaDoAndre.saca(5);
		System.out.println(contaDoAndre.saldo);
	
		Conta contaDaVi = new Conta();
		contaDaVi.deposita(1000);
		System.out.println(contaDaVi.saldo);
		contaDaVi.transferir(300, contaDoAndre);

		System.out.println(contaDoAndre.saldo);


	}

}
