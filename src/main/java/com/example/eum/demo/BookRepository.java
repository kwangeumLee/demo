package com.example.eum.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BookRepository implements CrudRepository<Book,Long> {
}
