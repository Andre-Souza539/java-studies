/*

 programa será responsável por calcular a média de um aluno
 e dizer se o  mesmo foi ou não aprovado com base em uma média
 mínima

 */
public class calculoAprovacao {
	public static void main(String[] args) {
		float nota1 = 5.5F;
		float nota2 = 9.3F;
		float nota3 = 8.5F;
		float nota4 = 7.0F;
		float result = (nota1 + nota2 + nota3 + nota4)/ 4;

		System.out.println("Sua Média é: " + result);

		if (result > 7) {
			boolean aprovado = true;
			System.out.println("Você foi aprovado Status de Aprovação: " + aprovado);
		} else {
			boolean aprovado = false;
			System.out.println("Você não foi aprovado Status de Aprovação: " + aprovado);
		}

	}
}
