package Q5;

abstract class Poligono implements Forma{

    private String nome;
    public Poligono(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private int numero;

    @Override
    public double calcularArea() {
        return 0;
    }
    
    
}
