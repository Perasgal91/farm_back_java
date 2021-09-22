package com.perasgal.farmback.service;

import com.perasgal.farmback.model.Cow;
import com.perasgal.farmback.repository.CowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CowService {
    private final CowRepository cowRepository;

    @Autowired
    public CowService(
            final CowRepository repository) {
        super();

        cowRepository = repository;
    }

    public Cow createCow(Cow c){
      return cowRepository.createCow(c);
    }

    public Cow modifyCow(Cow c){
        return cowRepository.modifyCow(c);
    }

    public List<Cow> findAll(){
        return cowRepository.findAll();
    }

    public List<Cow> findByNameContainsIgnoreCase(String name){
        return cowRepository.findByNameContainsIgnoreCase(name);
    }

    public Boolean existsById(int id){
      return  cowRepository.existsById(id);
    }
    public Optional<Cow> findById(int id){
        return cowRepository.findById(id);
    }

}
