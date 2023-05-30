package com.begivenhet.hvaskjers.services;

import com.begivenhet.hvaskjers.interfaces.CategoryInterface;
import com.begivenhet.hvaskjers.models.Categorys;
import com.begivenhet.hvaskjers.repositories.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class CategoryService implements CategoryInterface {

    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Categorys SaveCategory(Categorys categorySave) {
        return categoryRepo.save(categorySave);
    }

    @Override
    public List<Categorys> allCategory() {
        return categoryRepo.findAll();
    }
}
