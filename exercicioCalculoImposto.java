package curso.devdojo;

import java.util.Scanner;

public class exercicioCalculoImposto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Salário -> ");
        float salario = sc.nextFloat();
        if (salario <= 34712) {
            System.out.println(salario *= 97F/100);

        }

    }
}
