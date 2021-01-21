package Projeto.classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args) {
        final PessoaFisica pessoaFisica = new PessoaFisica(33, 56.5f);

        System.out.println(pessoaFisica.relatorio());
    }
}
