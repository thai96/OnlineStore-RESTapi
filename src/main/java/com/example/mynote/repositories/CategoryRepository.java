package com.example.mynote.repositories;

import com.example.mynote.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Boolean existsByCategoryName(String category);
}
