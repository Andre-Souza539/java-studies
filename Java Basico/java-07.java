/* Complexidade reduzida, agrupando condiconais para testes */ 
public class maiorIdadePlus {
	public static void main(String[] args) {

		int idade = 17 ;
		int quantidadePessoas = 1;

		if (idade >= 18 || quantidadePessoas > 1) {
			System.out.println("Você pode entrar!");
		} else {
			System.out.println("Infelizmente você não é de maior e está desacompanhado!");
		}

	}
}
