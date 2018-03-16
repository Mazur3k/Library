package com.hibernate.demo.service;

import com.hibernate.demo.dao.BookRepository;
import com.hibernate.demo.domain.Author;
import com.hibernate.demo.domain.Book;
import com.hibernate.demo.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Iterable<Book> getAll(){
        return bookRepository.findAll();
    }

    public Book getById(long id){
        return bookRepository.findOne(id);
    }

    public List<Book> getByTitle(String title){
        return bookRepository.findByTitleIgnoreCase(title);
    }

    public List<Book> getByCategory(Category category){
        return bookRepository.findByCategory(category);
    }

//    public List<Book> getByAuthor(Author author){
//        return bookRepository.findByAuthor(author);
//    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public void deleteBook(long id){
        bookRepository.delete(id);
    }
}
