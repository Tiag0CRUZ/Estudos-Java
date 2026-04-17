package poo.exercicio;

import poo.dominio.carro;

public class exercicioPooClasses {
    static void main(String[] args) {
        carro carro1 = new carro();
        carro carro2 = new carro();

        carro1.nome = "Peugeot";
        carro1.modelo = "passion 207";
        carro1.ano = 2012;

        carro2.nome = "palio";
        carro2.modelo = "wekend";
        carro2.ano = 2005;


        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println();
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
