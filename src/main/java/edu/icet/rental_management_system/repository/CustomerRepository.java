package edu.icet.rental_management_system.repository;

import edu.icet.rental_management_system.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
    CustomerEntity findByCustomerId(Long customerId);
}
