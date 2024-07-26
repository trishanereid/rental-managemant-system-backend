package edu.icet.rental_management_system.repository;

import edu.icet.rental_management_system.entity.ItemEntity;
import edu.icet.rental_management_system.entity.RentalEntity;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepository extends CrudRepository<RentalEntity, Long> {
    RentalEntity findByRentId(Long rentId);
}
