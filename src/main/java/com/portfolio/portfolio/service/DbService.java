package com.portfolio.portfolio.service;

import com.portfolio.portfolio.domain.Readers;
import com.portfolio.portfolio.domain.ReadersDto;
import com.portfolio.portfolio.domain.TitlesDto;
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
}
