package com.bookstore.api.repositories;

import com.bookstore.api.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface BookRepository  extends JpaRepository<Book,Long> {
}
