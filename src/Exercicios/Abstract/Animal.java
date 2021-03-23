package Exercicios.Abstract;

public abstract class Animal {
    String raca;
    String especie;

    abstract void walk();

    abstract Animal thisAnimal(Animal a);

}
