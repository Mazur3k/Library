package com.hibernate.demo.configuration;
import com.hibernate.demo.domain.Author;
import com.hibernate.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AddTestData {
    @Autowired
    AuthorService authorService;

    @PostConstruct
    public void addTestData(){
        authorService.addAuthor(new Author("Adam","Mazurkiewicz",25));
        authorService.addAuthor(new Author("Pawel","Kownacki",35));
        authorService.addAuthor(new Author("Jan","Kowalski",44));
        authorService.addAuthor(new Author("Bozydar","Iwanov",37));
        authorService.addAuthor(new Author("John","Smith",68));
    }
}
