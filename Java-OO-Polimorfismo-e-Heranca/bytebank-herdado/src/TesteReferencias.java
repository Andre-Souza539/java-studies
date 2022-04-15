
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("André");
		g1.setSalario(5000);
		System.out.println("Bonificacao do Gerente é de: R$"+g1.getBonificacao());
		
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2000);
		System.out.println("Bonificacao do Editor de vídeo é de: R$"+ev1.getBonificacao());
		
		Designer d1 = new Designer();
		d1.setSalario(2500);
		
		System.out.println("Bonificacao do Designer é de: R$"+d1.getBonificacao());
		
	}
	
	
}
