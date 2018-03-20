package com.portfolio.portfolio;

import com.portfolio.portfolio.dao.BooksDao;
import com.portfolio.portfolio.dao.ReadersDao;
import com.portfolio.portfolio.dao.RentsDao;
import com.portfolio.portfolio.dao.TitlesDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.TIMEOUT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryRunApplicationTestSuite {

	@Autowired
	BooksDao booksDao;
	@Autowired
	ReadersDao readersDao;
	@Autowired
	RentsDao rentsDao;
	@Autowired
	TitlesDao titlesDao;

//	@Test
//	public void contextLoads() {
//	}
	@Test
	public void TestsDao() {

		Titles title = new Titles("Kilimangaro", "Johm MCanzie", 1990);
		Readers reader = new Readers("Alice", "Cooper");
		Books books = new Books(title, "inUse");
		Rents rent = new Rents(reader, books);
		readersDao.save(reader);
		titlesDao.save(title);
		booksDao.save(books);
		rentsDao.save(rent);


	}

}
