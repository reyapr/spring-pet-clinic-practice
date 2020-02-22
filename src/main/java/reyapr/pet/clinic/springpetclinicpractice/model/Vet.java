package reyapr.pet.clinic.springpetclinicpractice.model;

public class Vet extends Person {

    private String vet;

    public Vet(String firstName, String lastName, String vet) {
        super(firstName, lastName);
        this.vet = vet;
    }
}
