package com.bookstore.api.repositories;

import com.bookstore.api.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface BookRepository  extends JpaRepository<Book,Long> {

    Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
