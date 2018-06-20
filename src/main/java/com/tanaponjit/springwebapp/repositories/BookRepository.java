package com.tanaponjit.springwebapp.repositories;

import com.tanaponjit.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{

}
