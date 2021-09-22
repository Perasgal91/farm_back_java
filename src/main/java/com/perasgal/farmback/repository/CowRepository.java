package com.perasgal.farmback.repository;

import com.perasgal.farmback.model.Cow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

public interface CowRepository extends JpaRepository<Cow, Integer> {

    @PostMapping
    default Cow createCow(final Cow c){
       return save(c);
    }

    @Override
    Optional<Cow> findById(Integer id);

    @GetMapping
    List<Cow> findAll();

    @GetMapping
    List<Cow> findByNameContainsIgnoreCase(String name);

    @PutMapping
    default Cow modifyCow(final Cow c){
        return save(c);
    }

}
