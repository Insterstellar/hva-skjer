package com.begivenhet.hvaskjers.controllers;

import com.begivenhet.hvaskjers.models.Categorys;
import com.begivenhet.hvaskjers.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @Autowired
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping("/save")
    public ResponseEntity<Categorys> saveCategories(@RequestBody Categorys saveCategory){
        Categorys saveCat=categoryService.SaveCategory(saveCategory);
        return new ResponseEntity<>(saveCat,HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public List<Categorys> allCategory(){
        return categoryService.allCategory();
    }
}
