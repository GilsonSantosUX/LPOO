package Q5;

public abstract class Pessoa implements Autenticavel{
    private String nome;
    private String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public Pessoa(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public int compareTo(Object prod){
        Pessoa o = (Pessoa) prod;
        return this.getNome().compareTo(o.getNome());
    }

    public String toString(){
        return this.getNome().toString();
    }

    @Override
    public boolean autenticarSenha(String senha){
        return true;
    }

    @Override
    public boolean definirSenha(String senha){
        return true;
    }
}
