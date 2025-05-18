package com.dantte_011d.springboot.jpa.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.dantte_011d.springboot.jpa.demo.person;
import java.util.List;


public interface PersonRepository extends CrudRepository<person, Long> {

    
    List<person> findByLenguajesProgramacion(String lenguajesProgramacion);
    
}

