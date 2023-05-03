import java.util.Scanner;

public class Break {
    public static void main  (String[] args){
        Scanner entrada = new Scanner(System.in);
        String conceito ="";
        System.out.println("Informe a nota ");
        int nota = entrada.nextInt();
        switch (nota){
            case 10: case 9 :
                conceito = "A";
                break;
            case 8: case 7 :
                conceito = "B";
                break;
            case 6: case 5 :
                conceito = "c";
                break;
            case 4: case 3:
                conceito = "d";
                break;
            case 2: case 1 :
                conceito = "e";
                break;
            case 0:
                conceito = "f";
                break;
            default:
                conceito ="nao informado";
        }
        System.out.println("conceito e " +conceito);
        entrada.close();

    }
}
