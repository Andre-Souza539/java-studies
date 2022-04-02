public class escopoVariaveis {

        public static void main(String[] args){
            System.out.println("testando escopo variáveis");

            int idade = 20;
            int quantidadePessoas = 3;
            /* Declaração da variável boolean para poder utilizar dentro do bloco if */
            boolean acompanhado = true;

            if (quantidadePessoas >= 2) {
                 acompanhado = true;
            }else {
                 acompanhado = false;
            }

            if (idade >=18 || acompanhado){

                System.out.println("Seja bem vindo");
            } else {
                System.out.println("infelizmente voce nao pode entrar");
        }

    }
}
