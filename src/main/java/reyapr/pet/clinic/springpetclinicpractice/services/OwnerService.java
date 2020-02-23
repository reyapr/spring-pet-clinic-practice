package reyapr.pet.clinic.springpetclinicpractice.services;

import reyapr.pet.clinic.springpetclinicpractice.model.Owner;

public interface OwnerService implements CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
