package Projeto.classes.pessoa;

import Projeto.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {
    public static void main(String[] args) {
        final var robin = new SuperUsuario("robin", "1234");

        robin.getLogin();

        //robin.getSenha() //ERRO = PROTECTED

    }
}
