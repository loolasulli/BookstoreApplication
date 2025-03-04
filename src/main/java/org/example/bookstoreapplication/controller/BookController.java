package org.example.bookstoreapplication.controller;

import org.example.bookstoreapplication.repository.BookRepository;
import org.example.bookstoreapplication.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/available")
    public List<BookRepository.Book> getAvailable() {
        return bookService.getInStock();
    }

    @GetMapping("/price/{maxPrice}")
    public List<BookRepository.Book> getByPrice(@PathVariable double maxPrice) {
        return bookService.getByMaxPrice(maxPrice);
    }
}