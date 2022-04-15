
public class TestaFuncionario {

	public static void main(String[] args) {
		
		EditorVideo f1 = new EditorVideo();
		f1.setNome("Nico");
		f1.setCpf("777.777.777-77");
		f1.setSalario(2500);
		
		
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
		System.out.println(f1.getBonificacao());
	}

}
