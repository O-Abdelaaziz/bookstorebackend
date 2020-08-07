package com.bookstore.api.repositories;

import com.bookstore.api.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book,Long> {
}
