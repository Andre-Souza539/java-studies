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

/* Criando Cliente */


public class Cliente {

	String nome;
	String cpf;
	String profissao;

}


/* Testando Objeto Cliente */


public class objetoCliente {
	public static void main(String[] args) {

		Cliente andre = new Cliente();
		andre.nome = "André";
		andre.cpf = "555.555.555-55";
		andre.profissao = "Programador";

		System.out.println(andre.nome + " " + andre.cpf + " " + andre.profissao );

		Conta conta01 = new Conta();
		conta01.saldo = 100;
		conta01.titular = andre;
		conta01.agencia = 123;
		conta01.numero = 666;

		System.out.println(conta01.saldo + " " + conta01.titular.nome + " " + conta01.numero );

	}
}

/* Atributo Privado */

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;


	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if(this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		}
		System.out.println("Saldo Insuficiente");
		return false;

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
	/* Agora será necessário o uso do Método pegaSaldo() para verificar o valor
	do saldo em uma conta  */
	public double pegaSaldo() {
		return this.saldo;
	}
}

/* */
