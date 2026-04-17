package curso.devdojo;
import java.util.Scanner;

public class exercicioCondicionaisIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digie sua idade: ");
        int idade = sc.nextInt();

            if (idade >= 18 ){
                System.out.println("Permitido a compra.");
            }
            else{
                System.out.println("Compra negada.");
            }
    }
}
