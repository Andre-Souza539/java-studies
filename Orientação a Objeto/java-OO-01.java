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
