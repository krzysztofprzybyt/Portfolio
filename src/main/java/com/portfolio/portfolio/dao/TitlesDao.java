package com.portfolio.portfolio.dao;

import com.portfolio.portfolio.Titles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TitlesDao extends CrudRepository<Titles, Integer> {
    List<Titles> findByTitle(String title);
}
