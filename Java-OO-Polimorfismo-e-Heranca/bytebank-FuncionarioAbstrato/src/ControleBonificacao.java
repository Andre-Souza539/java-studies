/* 
 * 1) Para controlar a bonificação dos funcionários, crie a classe ControleBonificacao 
 * com o atributo privado soma, do tipo double, e seu getter.
 * 
 * 2) Nessa classe, crie o método registra, que recebe um Funcionario por parâmetro, 
 * pega a sua bonificação, e em seguida a soma com as outras bonificações. E, crie também o 
 * método getSoma para retornar o valor do atributo soma 
 * 
*/

public class ControleBonificacao {
	
	private double soma;
	
	
	public double getSoma() {
		return soma;
	}
	
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	
}
