package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.domain.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/library")
public class LibraryController {

    @RequestMapping(method = RequestMethod.POST, value = "addReader")
    public void addReader(ReadersDto readersDto) {}

    @RequestMapping(method = RequestMethod.POST, value = "addTitle")
    public void addTitle(TitlesDto titlesDto) {}

    @RequestMapping(method = RequestMethod.POST, value = "addBook")
    public void addBook(BooksDto booksDto) {}

    @RequestMapping(method = RequestMethod.PUT, value = "changeBookStatus")
    public BooksDto changeBookStatus(BooksDto booksDto) {
        return new BooksDto(1, "inUse");
    }

    @RequestMapping(method = RequestMethod.GET, value = "getBooksOfTitleInUse")
    public Integer getBooksOfTitleInUse(Titles titles) {
        return 0;
    }

    @RequestMapping(method = RequestMethod.POST, value = "rentBook")
    public void rentBook(RentsDto rentsDto) {}

    @RequestMapping(method = RequestMethod.DELETE, value = "returnBook")
    public void returnBook(Integer bookId) {}
}
