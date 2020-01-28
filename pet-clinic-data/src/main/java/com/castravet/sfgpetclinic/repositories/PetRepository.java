package com.castravet.sfgpetclinic.repositories;

import com.castravet.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
