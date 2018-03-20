package com.portfolio.portfolio.dao;

import com.portfolio.portfolio.Readers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ReadersDao extends CrudRepository<Readers, Integer> {
    List<Readers> findByUserId(int id);
}
