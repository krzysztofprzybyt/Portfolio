package com.portfolio.portfolio.repositoryDao;

import com.portfolio.portfolio.domain.Books;
import com.portfolio.portfolio.domain.Titles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BooksDao extends CrudRepository<Books, Integer> {
    List<Books> findByBookId(int bookId);

    @Override
    Books save(Books book);

    @Override
    List<Books> findAll();

    Books findByTitle(Titles titles);


}
