package edu.icet.rental_management_system.repository;

import edu.icet.rental_management_system.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity, Long> {

}
