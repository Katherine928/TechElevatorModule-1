package com.techelevator.bookstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStoreApp {

    public static <bookInventory> void main(String[] args) {

        Book book1 = new Book("484100","Gone with the Wind");
        Book book2 = new Book("783161","Pride and Prejudice");
        Book book3 = new Book("658247","The Great Gatsby");


        Map<String, Book> books = new HashMap<>();
        books.put(book1.getIsBn(),book1);
        book1.setPrice(25.00);
        books.put(book2.getIsBn(),book2);
        book2.setPrice(17.00);
        books.put(book3.getIsBn(),book3);
        book3.setPrice(30.00);

        BookStoreApp app = new BookStoreApp();

        List<Book> bookList = app.hasToList(books);
        for(Book item: bookList) {
            System.out.println(item.toString());
        }

    }
    private List<Book> hasToList(Map<String, Book> map) {
        List<Book> bookList = new ArrayList<>();
        for(Map.Entry<String, Book> item: map.entrySet()) {
            bookList.add(item.getValue());
        }
        return bookList;
    }

}
