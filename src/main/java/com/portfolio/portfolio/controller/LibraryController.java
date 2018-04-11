package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.domain.*;
import com.portfolio.portfolio.mapper.BooksMapper;
import com.portfolio.portfolio.mapper.ReadersMapper;
import com.portfolio.portfolio.mapper.RentsMapper;
import com.portfolio.portfolio.mapper.TitlesMapper;
import com.portfolio.portfolio.repositoryDao.TitlesDao;
import com.portfolio.portfolio.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/v1/library")
public class LibraryController {
    @Autowired
    private  DbService service;

    @Autowired
    private BooksMapper booksMapper;

    @Autowired
    private ReadersMapper readersMapper;

    @Autowired
    private RentsMapper rentsMapper;

    @Autowired
    private TitlesMapper titlesMapper;


    @RequestMapping(method = RequestMethod.POST, value = "addReader", consumes = APPLICATION_JSON_VALUE)
    public void addReader(@RequestBody ReadersDto readersDto) {
        service.addReader(readersMapper.mapToReaders(readersDto));
    }

    @RequestMapping(method = RequestMethod.POST, value = "addTitle", consumes = APPLICATION_JSON_VALUE)
    public void addTitle(@RequestBody TitlesDto titlesDto) {

        service.addTittle(titlesMapper.mapToTitles(titlesDto));
    }

    @RequestMapping(method = RequestMethod.POST, value = "addBook", consumes = APPLICATION_JSON_VALUE)
    public void addBook(@RequestBody BooksDto booksDto) {


         service.addBook(booksMapper.mapToBooks(booksDto));
       // addBookTitle(booksDto2);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "changeBookStatus", consumes = APPLICATION_JSON_VALUE)
    public void changeBookStatus(@RequestBody BooksDto booksDto) {
        //return new BooksDto("inUse");
    }
    @RequestMapping(method = RequestMethod.PUT, value = "addBookTitle", consumes = APPLICATION_JSON_VALUE)
    public BooksDto addBookTitle(@RequestBody BooksDto booksDto) {
        return booksMapper.mapToBooksDto(service.addBook(booksMapper.mapToBooks(booksDto)));
    }

    @RequestMapping(method = RequestMethod.GET, value = "getBooksOfTitleInUse", consumes = APPLICATION_JSON_VALUE)
    public Integer getBooksOfTitleInUse(@RequestBody Titles titles) {
        return 10;
    }

    @RequestMapping(method = RequestMethod.POST, value = "rentBook", consumes = APPLICATION_JSON_VALUE)
    public void rentBook(@RequestBody RentsDto rentsDto) {}

    @RequestMapping(method = RequestMethod.DELETE, value = "returnBook", consumes = APPLICATION_JSON_VALUE)
    public void returnBook(@RequestParam Integer bookId) {}

    @RequestMapping(method = RequestMethod.GET, value = "getReaders", consumes = APPLICATION_JSON_VALUE)
    public List<ReadersDto> getReaders() {
        return readersMapper.mapToReadersDtoList(service.getAllReaders());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getBooks", consumes = APPLICATION_JSON_VALUE)
    public List<BooksDto> getBooks() {
        return booksMapper.mapToBooksDtoList(service.getAllBooks());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTitles", consumes = APPLICATION_JSON_VALUE)
    public List<TitlesDto> getTitles() {
        return titlesMapper.mapToTitlesDtoList(service.getAllTitles());
    }
}
