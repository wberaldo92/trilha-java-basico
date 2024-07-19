import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            double valorDoce = valorAleatorio();
            /*só fez essa verificação pra que caso o valor do doce seja maior que a mesada,
            * esse if irá igualar ao valor da mesada para nao termos que fazer outra verificação*/
            if(valorDoce > mesada)
            valorDoce = mesada;

            System.out.println("Doce do calor: " + valorDoce + " Adicionado no carrinho!");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces!");
    }

    /*
     * Não se preocupar agora quanto a formatação dos valores pois
     * iremos explorar os recursos de formatação em breve
     */

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
