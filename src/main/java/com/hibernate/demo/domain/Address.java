package com.hibernate.demo.domain;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String city;
    private String country;

    @OneToOne
    private Author author;

    public Address(String city, String country, Author author) {
        this.city = city;
        this.country = country;
        this.author = author;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getCity() {

        return city;
    }

    public String getCountry() {
        return country;
    }

    public Author getAuthor() {
        return author;
    }
}
