package com.portfolio.portfolio.dao;

import com.portfolio.portfolio.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BooksDao extends CrudRepository<Books, Integer> {
    List<Books> findByBookId(int bookId);


}
