package edu.icet.rental_management_system.bo;

import edu.icet.rental_management_system.dto.Customer;

public interface CustomerBo {
    void add(Customer customer);

    void update(Customer customer);

    Customer searchById(Long customerId);
}
