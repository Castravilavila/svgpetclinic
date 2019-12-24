package com.castravet.sfgpetclinic.services;

import com.castravet.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById();

    Pet save(Pet pet);

    Set<Pet> findAll();
}
