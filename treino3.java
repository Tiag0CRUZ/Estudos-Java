/*Peça um número ao usuário e informe se ele é:
Par
Ímpar
Exemplo:
Digite um número: 7
O número é ímpar*/

package treino.java.gpt;

import java.util.Scanner;

class treino2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0 ){
            System.out.println("par");
        }
        else{
            System.out.println("ímpar");
        }
    }
}
////////////////////////////////////////////////////////////////////////////////

/*Média de notas
Crie um programa que:
Peça 3 notas
Calcule a média
Mostre:
Média	Situação
 =7    Aprovado
5–6.9  Recuperação
<5     Reprovado */

class treino3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a primeira nota ->");
        double primeiranota = sc.nextDouble();
        System.out.println("digite a segunda nota ->");
        double segundanota = sc.nextDouble();
        System.out.println("digite a terceira nota ->");
        double terceiranota = sc.nextDouble();

        double media = (primeiranota + segundanota + terceiranota) /3;
        System.out.println(media);

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 5) {
            System.out.println("Reprovado");
        }
        else {
            System.out.println("Recuperação");
        }


    }
}
