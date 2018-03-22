package com.portfolio.portfolio.service;

import com.portfolio.portfolio.domain.*;
import com.portfolio.portfolio.repositoryDao.BooksDao;
import com.portfolio.portfolio.repositoryDao.ReadersDao;
import com.portfolio.portfolio.repositoryDao.RentsDao;
import com.portfolio.portfolio.repositoryDao.TitlesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Readers addReader(Readers readers) {
        return readersDao.save(readers);
    }
    public Titles addTittle(final Titles titles) {
        return titlesDao.save(titles);
    }
    public Books addBook(final Books books) {
        return booksDao.save(books);
    }
    public List<Titles> findTitle(Titles titles) {
        return titlesDao.findByTitleAndAuthorAndPublicationYear(
                titles.getTitle(),
                titles.getAuthor(),
                titles.getPublicationYear());
    }
}
