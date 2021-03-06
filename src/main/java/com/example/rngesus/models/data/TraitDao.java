package com.example.rngesus.models.data;

import com.example.rngesus.models.Trait;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface TraitDao extends CrudRepository<Trait, Integer> {

    List<Trait> findByName(String name);

}
