package reyapr.pet.clinic.springpetclinicpractice.services.map;

import com.sun.xml.bind.v2.model.core.ID;
import reyapr.pet.clinic.springpetclinicpractice.model.Vet;
import reyapr.pet.clinic.springpetclinicpractice.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
