package santanderBootcamp.metodosJava;

public class Mensagem {

    public static void getMessage(int hora) {

        switch(hora){
            case 6:
            case 8:
            case 9:
            case 10:
                mensagemDia();
                break;
            case 13:
            case 14:
            case 15:
                mensagemTarde();
                break;
            case 19:
            case 20:
            case 21:
                mensagemNoite();
                break;
            default:
                System.out.println("Deve ser de madrugada, nessa caso, vá dormir!");
                break;



        }

    }

    public static void mensagemDia() {
        System.out.println(" Bom dia, flor do dia!!");
    }
    public static void mensagemTarde() {
        System.out.println(" Boa Tarde!!");
    }
    public static void mensagemNoite() {
        System.out.println(" Boa Noite!!");
    }

}
