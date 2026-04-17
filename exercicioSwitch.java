package curso.devdojo;

import java.util.Scanner;

public class exercicioSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana de 1 a 7 - ");
        byte dia = sc.nextByte();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Fim de semana.");
                break;
            case 2:
                System.out.println("Segundo");
                System.out.println("Dia Útil");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("Dia Útil");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("Dia Útil");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia Útil");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("Dia Útil");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("Fim de semana.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
