package Pessoa;

import Humano.Humano;

public class Pessoa extends Humano {
    private String nome;
    private int idade;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf.toString();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome.toString();
    }

    public Pessoa(String nome, int idade, String cpf) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa(){
        super();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome:"+this.getNome()+"\n").append("Idade:"+this.getIdade()+"\n").append("CPF:"+this.getCpf()+"\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if (o == this) { 
            return true; 
        } 
        if (!(o instanceof Pessoa)) { 
            return false; 
        } 

        // typecast
        Pessoa c = (Pessoa) o;
          
        if( this.getCpf().equals(c.getCpf()) && this.getNome().equals(c.getNome()) && this.getIdade() == c.getIdade())
            return true;

        return false;
    }

    public boolean equals(Pessoa ob){
        if( this.getCpf().equals(ob.getCpf()) && this.getNome().equals(ob.getNome()) && this.getIdade() == ob.getIdade()){
            return true;
        }
        return false;
    }

}
