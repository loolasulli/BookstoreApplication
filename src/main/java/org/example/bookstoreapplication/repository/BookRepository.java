package org.example.bookstoreapplication.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepository {

    private final List<Book> books;

    public BookRepository(List<Book> books) {
        this.books = books;
    }

    public List<Book> getAllBooks() {
        return Arrays.asList(
                new Book("Stoikin gündəliyi", new Author("Ryan", "Holiday", 1987)
                , 13.90, true),
                new Book("Uşağınızı fransız kimi böyüdün", new Author("Pamela",
                        "Druckerman", 1970), 10.90, false),
                new Book("Lola ve komşu çocuk", new Author("Stephanie", "Perkins",
                        1981), 11.76, false),
                new Book("Atomik vərdişlər", new Author("James", "Clear", 1986)
                        , 12.99, true),
                new Book("Necə ölməməli?!", new Author("Michael", "Greger", 1972)
                        , 14.90, true)
        );
    }

    public class Book {
        private String title;
        private Author author;
        private double price;
        private boolean isInStock;

        public Book(String title, Author author, double price, boolean isInStock) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.isInStock = isInStock;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean isInStock() {
            return isInStock;
        }

        public void setInStock(boolean inStock) {
            isInStock = inStock;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author=" + author +
                    ", price=" + price +
                    '}';
        }
    }
}

