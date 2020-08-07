package com.bookstore.api.repositories;

import com.bookstore.api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category,Long> {
}
