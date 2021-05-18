package henraca;

public class Papagaio extends Ave{
    public Papagaio(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Som papagiaio!!!");
    }

    @Override
    public void voar(){
        System.out.println("O papagiaio"+getNome());
    }
}