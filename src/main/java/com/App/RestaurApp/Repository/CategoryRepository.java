package com.App.RestaurApp.Repository;

import com.App.RestaurApp.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
