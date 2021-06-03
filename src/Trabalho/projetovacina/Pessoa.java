package projetovacina;

public class Pessoa {
    private String nome;
    private int idade;
    private  String cpf;
    private String celular;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCelular(){
        return this.celular;
    }
    public void setCelular(String celular){
        this.celular = celular;
    }

    public Pessoa(String nome,int idade,String cpf,String celular){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.celular = celular;
    }

    public Pessoa(){}

    @Override
    public String toString(){ 
    StringBuilder sb = new StringBuilder();
        sb.append("Nome: "+this.getNome()+"\n").append("Idade: "+this.getIdade()+"\n").append("CPF: "+this.getCpf()+"\n").append("Celular: "+this.getCelular()+"\n");
        return sb.toString();
    }
}
