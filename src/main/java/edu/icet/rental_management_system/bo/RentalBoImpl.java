package edu.icet.rental_management_system.bo;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.rental_management_system.dto.Item;
import edu.icet.rental_management_system.dto.Rental;
import edu.icet.rental_management_system.entity.RentalEntity;
import edu.icet.rental_management_system.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RentalBoImpl implements RentalBo{
    final RentalRepository repository;
    final ObjectMapper mapper;
    @Override
    public void addRent(Rental rental) {

    }

    @Override
    public Item searchById(Long rentId) {
        return null;
    }

    @Override
    public void deleteById(Long rentId) {

    }

    @Override
    public Iterable<RentalEntity> viewAll() {
        return repository.findAll();
    }
}