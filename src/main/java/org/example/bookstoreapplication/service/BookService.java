package org.example.bookstoreapplication.service;

import org.example.bookstoreapplication.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookRepository.Book> getInStock() {
        return bookRepository.getAllBooks().stream()
                .filter(BookRepository.Book::isInStock)
                .collect(Collectors.toUnmodifiableList());
    }

    public List<BookRepository.Book> getByMaxPrice(double maxPrice) {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getPrice() < maxPrice)
                .collect(Collectors.toUnmodifiableList());
    }
}
