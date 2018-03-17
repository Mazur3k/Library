package com.hibernate.demo.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany
    private Set<Book> books;

    public Category(String name){
        this.name = name;
    }

    public Category(){
        //for hibernate
    }

    public String getName(){
        return name;
    }
}
