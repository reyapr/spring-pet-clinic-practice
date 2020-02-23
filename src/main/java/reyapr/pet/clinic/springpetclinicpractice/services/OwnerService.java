package reyapr.pet.clinic.springpetclinicpractice.services;

import reyapr.pet.clinic.springpetclinicpractice.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
