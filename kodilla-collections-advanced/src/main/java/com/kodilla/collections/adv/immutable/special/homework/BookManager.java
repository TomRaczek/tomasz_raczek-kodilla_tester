package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    public static Set<Book> books = new HashSet<>();
    public static Book createBook(String title, String author){
        Book book = new Book(title, author);
        if (books.add(book)) {
            return book;
        } else {
            for (Book book1 : books) {
                if (book1.getAuthor().equals(author) && book1.getTitle().equals(title)) {
                    return book1;
                }
            }
        }
        return null;
    }
}