package Q5;

class Quadrado extends Poligono{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(String nome, int numero, double lado) {
        super(nome, numero);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.getLado()*this.getLado();
    }


    @Override
    public String toString() {
        return this.getNome()+" "+this.getNumero()+" "+this.getLado()+" "+this.calcularArea();
    }
    

}
