package com.tanaponjit.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.tanaponjit.springwebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
