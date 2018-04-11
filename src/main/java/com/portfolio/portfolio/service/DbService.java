package com.portfolio.portfolio.service;

import com.portfolio.portfolio.controller.LibraryException;
import com.portfolio.portfolio.domain.*;
import com.portfolio.portfolio.repositoryDao.BooksDao;
import com.portfolio.portfolio.repositoryDao.ReadersDao;
import com.portfolio.portfolio.repositoryDao.RentsDao;
import com.portfolio.portfolio.repositoryDao.TitlesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private BooksDao booksDao;

    @Autowired
    private TitlesDao titlesDao;

    @Autowired
    private RentsDao rentsDao;

    @Autowired
    private ReadersDao readersDao;

    public List<Readers> getAllReaders() {
        return readersDao.findAll();
    }
    public List<Books> getAllBooks() {
        return booksDao.findAll();
    }
    public List<Titles> getAllTitles() {
        return titlesDao.findAll();
    }
//    public Titles getTitle() {
//        if(titlesDao.findByTitleAndAuthorAndPublicationYear(
//                booksDto.getTitleDto().getTitle(),
//                booksDto.getTitleDto().getAuthor(),
//                booksDto.getTitleDto().getPublicationYear())==null) {
//            service.addTittle(titlesMapper.mapToTitles(booksDto.getTitleDto()));
//        }
//        TitlesDto titleDto = titlesMapper.mapToTitlesDto(titlesDao.findByTitleAndAuthorAndPublicationYear(
//                booksDto.getTitleDto().getTitle(),
//                booksDto.getTitleDto().getAuthor(),
//                booksDto.getTitleDto().getPublicationYear()));
//
//        BooksDto booksDto2= new BooksDto(
//                new TitlesDto(titleDto.getTitleId(),
//                        titleDto.getTitle(),
//                        titleDto.getAuthor(),
//                        titleDto.getPublicationYear()),
//                booksDto.getStatus() );
//
//    }
    public Readers addReader(Readers readers) {
        return readersDao.save(readers);
    }
    public void addTittle(final Titles titles) {
       if(titlesDao.findByTitleAndAuthorAndPublicationYear(
               titles.getTitle(),titles.getAuthor(),titles.getPublicationYear())==null) {
         titlesDao.save(titles);
       } else { System.out.println("Title is present");}
    }
    public Books addBook(final Books books) {
        Titles titles = titlesDao.findByTitleAndAuthorAndPublicationYear(
                books.getTitle().getTitle(),books.getTitle().getAuthor(),books.getTitle().getPublicationYear());
        if(titles==null) {

            return booksDao.save(books);

        } else {
            books.setTitle(titles);
            return booksDao.save(books);
        }


    }
    public Titles findTitle(Titles titles) {
        return titlesDao.findByTitleAndAuthorAndPublicationYear(
                titles.getTitle(),
                titles.getAuthor(),
                titles.getPublicationYear());
    }
}
