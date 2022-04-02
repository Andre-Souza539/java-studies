/* verifica idade e quantidade de pessoas*/
public class maiorIdadePlus {
	public static void main(String[] args) {

		int idade = 17 ;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("Você é de maior, pode entrar!");
		} else {
			if(quantidadePessoas > 1) {
				System.out.println("Embora você não seja de maior você está acompanhado, pode entrar!");

			} else {
				System.out.println("Infelizmente você não é de maior e está desacompanhado!");
			}
		}

	}
}
