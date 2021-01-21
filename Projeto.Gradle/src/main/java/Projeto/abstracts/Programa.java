package Projeto.abstracts;

public class Programa {
    public static void main(String[] args) {
        //Não tem como utilizar formageometrica como variavel para guardar FormaGeometrica,
        //Utilizando assim a variavel quadrado para poder imprimir.

        final FormaGeometrica quadrado = new Quadrado("quadrado ",10.0);
        System.out.println(quadrado);

        System.out.println(quadrado.desenha(12, 34));
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());

    }
}
