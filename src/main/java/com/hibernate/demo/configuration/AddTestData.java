package com.hibernate.demo.configuration;
import com.hibernate.demo.domain.Author;
import com.hibernate.demo.domain.Category;
import com.hibernate.demo.service.AuthorService;
import com.hibernate.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AddTestData {
    @Autowired
    AuthorService authorService;

    @Autowired
    CategoryService categoryService;

    @PostConstruct
    public void addTestData(){
        // adds authors
        authorService.addAuthor(new Author("Adam","Mazurkiewicz",25));
        authorService.addAuthor(new Author("Pawel","Kownacki",35));
        authorService.addAuthor(new Author("Jan","Kowalski",44));
        authorService.addAuthor(new Author("Bozydar","Iwanov",37));
        authorService.addAuthor(new Author("John","Smith",68));

        //adds categories
        categoryService.addCategory(new Category("Horror"));
        categoryService.addCategory(new Category("Fantasy"));
        categoryService.addCategory(new Category("Comedy"));
        categoryService.addCategory(new Category("Historical"));
        categoryService.addCategory(new Category("Science Fiction"));
        categoryService.addCategory(new Category("Romance"));
    }
}
