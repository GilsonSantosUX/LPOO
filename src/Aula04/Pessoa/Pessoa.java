package Pessoa;

import Humano.Humano;

public class Pessoa extends Humano{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(){}

    public Pessoa(String name,int idade,String cpf){
        
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("CPF:"+this.getCpf());
        return sb.toString();
    }
    
}
