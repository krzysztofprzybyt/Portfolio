package com.portfolio.portfolio;

import com.portfolio.portfolio.domain.Books;
import com.portfolio.portfolio.domain.Readers;
import com.portfolio.portfolio.domain.Rents;
import com.portfolio.portfolio.domain.Titles;
import com.portfolio.portfolio.repositoryDao.BooksDao;
import com.portfolio.portfolio.repositoryDao.ReadersDao;
import com.portfolio.portfolio.repositoryDao.RentsDao;
import com.portfolio.portfolio.repositoryDao.TitlesDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryRunApplicationTestSuite {

//	@Autowired
//	BooksDao booksDao;
//	@Autowired
//	ReadersDao readersDao;
//	@Autowired
//	RentsDao rentsDao;
//	@Autowired
//	TitlesDao titlesDao;
//
	@Test
	public void contextLoads() {
	}

//	@Test
//	public void TestsDao() {
//
//		Titles title = new Titles("ALigators", "John MCanzie", 1990);
//		Readers reader = new Readers("Alice", "Smith");
//		Books books = new Books(title, "damaged");
//
//		Rents rent = new Rents(reader, books);

//		if(readersDao.findByNameAndSurname(reader.getName(), reader.getSurname()).isEmpty()) {
//			readersDao.save(reader);
//		}
//		if(titlesDao.findByTitleAndAuthorAndPublicationYear(title.getTitle(), title.getAuthor(),title.getPublicationYear()).isEmpty()){
//			titlesDao.save(title);
//		}
//		booksDao.save(books);

//		rentsDao.save(rent);
//	}
}
