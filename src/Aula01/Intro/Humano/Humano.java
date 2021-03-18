package Humano;

public class Humano {
    private double height;
    private double weight;
    private String breed;
    private String genre;

    public String getGenre() {
        return genre;
    }

    public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Humano(double height,double weight, String breed, String genre){
        this.height = height;
        this.weight = weight;
        this.breed = breed;
        this.genre = genre;
    }

    public Humano(){}

    public void talk(String write){
        System.out.println(write);
    }

    
    
}