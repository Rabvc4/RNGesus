package com.example.rngesus.models.data;

import com.example.rngesus.models.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface InventoryDao extends CrudRepository<Inventory, Integer> {

    List<Inventory> findByPlayerCharacterId(int id);

}
