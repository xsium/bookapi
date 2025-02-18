package com.tyrfing.bookapi.repository;

import com.tyrfing.bookapi.model.Livre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends CrudRepository<Livre, Long> {

}