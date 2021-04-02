package com.nnt.demo.service;

import com.nnt.demo.model.Category;
import com.nnt.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public void save(Category category){
        categoryRepository.save(category);
    }
    public Category findCategoryById(int id){
        return categoryRepository.findCategoryById(id);
    }
}
