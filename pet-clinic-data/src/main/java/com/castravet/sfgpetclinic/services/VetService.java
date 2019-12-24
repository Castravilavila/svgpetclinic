package com.castravet.sfgpetclinic.services;

import com.castravet.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById();

    Vet save(Vet pet);

    Set<Vet> findAll();
}
