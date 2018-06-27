package com.example.rngesus.models.data;

import com.example.rngesus.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    public List<User> findByUsername(String username);

}
