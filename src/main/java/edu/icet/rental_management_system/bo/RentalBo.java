package edu.icet.rental_management_system.bo;

import edu.icet.rental_management_system.dto.Item;
import edu.icet.rental_management_system.dto.Rental;
import edu.icet.rental_management_system.entity.RentalEntity;

public interface RentalBo {
    void addRent(Rental rental);

    Item searchById(Long rentId);

    void deleteById(Long rentId);

    Iterable<RentalEntity> viewAll();
}
