package com.App.RestaurApp.Service;

import com.App.RestaurApp.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
     @Autowired
     private CategoryRepository categoryRepository;
    
}
