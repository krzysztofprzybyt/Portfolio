package com.portfolio.portfolio.repositoryDao;

import com.portfolio.portfolio.domain.Readers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface ReadersDao extends CrudRepository<Readers, Integer> {
    List<Readers> findByUserId(int id);
    List<Readers> findByNameAndSurname(String name, String surname);
    @Override
    List<Readers> findAll();
    @Override
    Readers save(Readers readers);
}
