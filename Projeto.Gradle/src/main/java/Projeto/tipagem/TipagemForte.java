package Projeto.tipagem;

public class TipagemForte {
    public static void main(String[] args) {
        String texto = "meu texto";
      //  texto = 1000; //NOK texto já está definido como String, então não é válido

        Integer numero = Integer.valueOf("1024");
        numero = 500; //OK

    }
}
