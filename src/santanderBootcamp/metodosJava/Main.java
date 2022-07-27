package santanderBootcamp.metodosJava;

public class Main {

    public static void main(String[] args) {

        //Calculater
        System.out.println("EXRCICIOS DA CALCULADORA: ");
        Calculadora.soma(5.3, 8.2);
        Calculadora.sub(7.1, 3);
        Calculadora.mult(3, 9);
        Calculadora.div(48, 8);

        //relogio
        System.out.println("EXRCICIO DA RELOGIO MENSAGEM: ");
        Mensagem.getMessage(8);
        Mensagem.getMessage(10);
        Mensagem.getMessage(14);
        Mensagem.getMessage(20);
        Mensagem.getMessage(3);

        //emprestimo
        /*Observação: dentro do metodo parcelar, estamos chamado os métodos
         especificos de quantidade de parcelas da classe emprestimo
         */
        System.out.println("EXRCICIOS DO EMPRÉSTIMO: ");
        Emprestimo.parcelar(1000, Emprestimo.getTwoParts());
        Emprestimo.parcelar(1000, Emprestimo.getThreeParts());
        Emprestimo.parcelar(10000, 5);


    }
}
