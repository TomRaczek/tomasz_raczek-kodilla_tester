package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.times;

class BookControllerTest {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        List<BookDto> result = bookController.getBooks();
        assertThat(result).hasSize(2);
    }
//    @Test
//    void shouldAddBook() {
//        BookService bookServiceMock = Mockito.mock(BookService.class);
//        BookController bookController = new BookController(bookServiceMock);
//
//        List<BookDto> providedBooksList = new ArrayList<>();
//        providedBooksList.add(new BookDto("Title 1", "Author 1"));
//        List<BookDto> expectedBookList = new ArrayList<>();
//        expectedBookList.add(new BookDto("Title 1", "Author 1"));
//        Mockito.when(bookServiceMock.getBooks()).thenReturn(providedBooksList);
//
//        List<BookDto> result = bookController.getBooks();
//        assertThat(result).isEqualTo(expectedBookList);
//    }
    @Test
    void shouldAddBook() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        bookController.addBook(new BookDto("Author 1", "Title 1"));
        Mockito.verify(bookServiceMock, times(1)).addBook(new BookDto("Author 1", "Title 1"));
    }
}