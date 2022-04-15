
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico");
		nico.setCpf("777.777.777-77");
		nico.setSalario(2500);
		
		
		System.out.println(nico.getNome());
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());
	}

}
