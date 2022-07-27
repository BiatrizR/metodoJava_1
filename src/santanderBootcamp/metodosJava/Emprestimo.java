package santanderBootcamp.metodosJava;

public class Emprestimo {

    public static int getTwoParts() {
        return 2;
    }

    public static int getThreeParts() {
        return 3;
    }

    public static double getTaxTwoParts() {
        return 0.3;
    }

    public static double getTaxThreeParts() {
        return 0.45;
    }

    public static void parcelar(double valor, int parcelas) {

        if(parcelas == 2) {

            double valorFinal = valor + (valor * getTaxTwoParts());
            System.out.println(" Se parcelar em duas vezes o valor final será: R$ " +valorFinal);
        }

        else if (parcelas == 3) {
            double valorFinal = valor + (valor * getThreeParts());
            System.out.println(" Se parcelar em três vezes o valor final será: R$ " +valorFinal);

        } else {

            System.out.println(" Quantidade de parcelas não autorizado!");
        }


    }
}
