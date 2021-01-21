package Projeto.classes.pessoa;

public class Pessoa {

    private Integer idade;
    private Float peso;

    public Pessoa(){ //Construtor vazio

    }

    public Pessoa(final Integer idade){ //Construtor só com idade
        this.idade = idade;
    }
    public Pessoa(final Integer idade, final Float peso){
        this.idade = idade;
        this.peso = peso;

    }
    public Integer getIdade(){return this.idade;}

    public Float getPeso(){return peso;}
    protected String relatorio(){
        return "Idade:$idade e Peso : $peso";

    }

}
