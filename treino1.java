package treino.java.gpt;
/*1️⃣ Calculadora simples
Crie um programa que:
Peça dois números ao usuário
Mostre:
soma
subtração
multiplicação
divisão
Exemplo de saída:
Digite o primeiro número: 10
Digite o segundo número: 5
Soma: 15
Subtração: 5
Multiplicação: 50
Divisão: 2*/

import java.util.Scanner;

public class treino1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();

        System.out.println(primeiroNumero + segundoNumero);
        System.out.println(primeiroNumero - segundoNumero);
        System.out.println(primeiroNumero * segundoNumero);
        System.out.println(primeiroNumero / segundoNumero);


    }

}