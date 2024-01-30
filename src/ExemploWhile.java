import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valoraDoce = valorAleatorio();

            if (valoraDoce > mesada)
                valoraDoce = mesada;

            System.out.printf("Doce do valor: %.2f \n", valoraDoce, " Adicione no carrinho");
            mesada = mesada - valoraDoce;
        }
        System.out.printf("Mesada: %.2f \n", mesada);
        System.out.println("Joãozinho gastou  toda a sua mesada em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1, 8);
    }
}
