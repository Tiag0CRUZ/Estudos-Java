package treino.java.gpt;
/*O que fazer: Crie uma variável String busca = "Tiago";. O programa deve percorrer o array e
dizer se esse nome está na lista ou não.
Dica: Em Java, para comparar Strings, não use ==. Use o método .equals(). Exemplo: if
(nomes[i].equals(busca)).*/
public class arrey {
    static void main(String[] args) {
        String[] nomes = {"Tiago", "Marjorie", "Alice"};
        String busca = "Alice";
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(busca)){
                System.out.println("pertence a lista");
            }
            else {
                System.out.println("Não pertence a lista");
            }

        }

    }
}

//Código Ajustado (O jeito profissional):


class treino6 {
    public static void main(String[] args) {
        // Cada nome com suas aspas e separados por vírgula
        String[] nomes = {"Tiago", "Marjorie", "Alice"};
        String busca = "Alice";

        boolean encontrou = false; // Nossa "bandeira"

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(busca)) {
                encontrou = true; // Se achou, marca como verdadeiro
                break; // Opcional: para o laço, pois já achamos quem queríamos
            }
        }

        // Fora do laço, verificamos o resultado final
        if (encontrou) {
            System.out.println(busca + " pertence à lista!");
        } else {
            System.out.println(busca + " não pertence à lista.");
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////


/*Crie um array de inteiros com 10 números (pode escolher os números que quiser).
O que fazer: O programa deve percorrer o array e imprimir no console apenas os números que
forem pares.
Dica de Professor: Use o operador de módulo %. Se numero % 2 == 0, o número é par.*/
class treino5 {
    static void main() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7,8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.println("números pares - " + numeros[i]);
            }
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////

/*Somador de Notas
Crie um programa que armazene 4 notas bimestrais em um array de números reais (double).
O que fazer: O programa deve somar todas as notas e exibir a média aritmética final no console.
Dica: Use notas.length para dividir a soma pelo número total de elementos.*/

class treino4 {
    static void main(String[] args) {
        int[] nota = new int[4];
        nota[0] = 2;
        nota[1] = 2;
        nota[2] = 2;
        nota[3] = 2;

        int soma = 0;

        for (int i = 0; i < nota.length; i++) {
            soma += nota[i];
        }
        int media = soma /nota.length;

        System.out.println("soma = " + soma);
        System.out.println("média = " + media);
    }

}