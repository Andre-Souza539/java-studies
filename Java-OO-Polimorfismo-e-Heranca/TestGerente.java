public class TestGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("André");
        g1.setCpf("111.111.111-11");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticacao = g1.autenticacao(2222);

        System.out.println(autenticacao);

    }

}
