package com.bookstore.api.repositories;

import com.bookstore.api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface CategoryRepository  extends JpaRepository<Category,Long> {
}
