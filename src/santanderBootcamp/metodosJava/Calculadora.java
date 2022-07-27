package santanderBootcamp.metodosJava;

public class Calculadora {

    public static void soma(double num1, double num2) {
        double result = num1 + num2;

        System.out.println(" A soma de " + num1 + " mais "+ num2 + " é igual a: " + result);
    }

    public static void sub(double num1, double num2) {
        double result = num1 - num2;

        System.out.println(" A subtração de " + num1 + " mais "+ num2 + "," +" é igual a: " + result);
    }

    public static void mult(double num1, double num2) {
        double result = num1 * num2;

        System.out.println(" A Multiplicação de " + num1 + " mais "+ num2 + "," +" é igual a: " + result);
    }

    public static void div(double num1, double num2) {
        double result = num1 / num2;

        System.out.println(" A Divisão de " + num1 + " mais "+ num2 + "," +" é igual a: " + result);
    }


}
