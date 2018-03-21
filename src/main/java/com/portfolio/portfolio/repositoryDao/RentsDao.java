package com.portfolio.portfolio.repositoryDao;

import com.portfolio.portfolio.domain.Rents;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface RentsDao extends CrudRepository<Rents, Integer> {
    List<Rents> findById(int id);
}
