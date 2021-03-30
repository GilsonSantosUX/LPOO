package Humano;

import java.time.LocalDate;
import java.util.Date;

public class Humano {
    private String firstName;
    private String lastName;
    private Date dateNasc;
    private int age;
    private String breed;

    public String getFirstName() {
        return firstName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateNasc() {
        return dateNasc;
    }

    public void setDateNasc(Date dateNascv) {
        this.dateNasc = dateNasc;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Humano(){}

    public Humano(String firstName,String lastName,Date dateNasc, String breed){
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateNasc = dateNasc;
        this.handleAge(dateNasc);
        this.breed = breed;
    }

    public void handleAge(Date dateNasc){
        int age = LocalDate.now().getYear() - dateNasc.getYear();
        this.setAge(age);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------");
        sb.append("FirstName:").append(this.getFirstName()).append("\n");
        sb.append("LastName:").append(this.getLastName()).append("\n");
        sb.append("Date Nasc:").append(this.getDateNasc()).append("\n");
        sb.append("Age:").append(this.getAge()).append("\n");
        sb.append("Breed:").append(this.getBreed()).append("\n");
        sb.append("-------------------------------------");
        return sb.toString();
    }
}
