package Q5;

class Triangulo extends Poligono{
    private double base,altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(String nome, int numero, double base, double altura) {
        super(nome, numero);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.getBase()*this.getAltura())/2.0;
    }

    @Override
    public String toString() {
        return this.getNome()+" "+this.getNumero()+" "+this.calcularArea();
    }
    
}
