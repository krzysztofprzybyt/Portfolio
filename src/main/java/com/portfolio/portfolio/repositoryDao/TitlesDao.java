package com.portfolio.portfolio.repositoryDao;

import com.portfolio.portfolio.domain.Titles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface TitlesDao extends CrudRepository<Titles, Integer> {
    List<Titles> findByTitle(String title);

    List<Titles> findByTitleAndAuthorAndPublicationYear(String title, String author, Integer publicationYear);

    @Override
    Titles save(Titles titles);

    @Override
    List<Titles> findAll();
}
