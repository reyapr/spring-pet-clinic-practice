package reyapr.pet.clinic.springpetclinicpractice.model;

public class Owner extends Person{

    private String owner;

    public Owner(String firstName, String lastName, String owner) {
        super(firstName, lastName);
        this.owner = owner;
    }
}
