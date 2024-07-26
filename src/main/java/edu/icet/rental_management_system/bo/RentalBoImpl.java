package edu.icet.rental_management_system.bo;

import com.fasterxml.jackson.databind.ObjectMapper;
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
        repository.save(
                mapper.convertValue(rental, RentalEntity.class)
        );
    }

    @Override
    public Rental searchById(Long rentId) {
        RentalEntity byRentalId = repository.findByRentId(rentId);
        return mapper.convertValue(byRentalId, Rental.class);
    }

    @Override
    public void deleteById(Long rentId) {
        repository.deleteById(rentId);
    }

    @Override
    public Iterable<RentalEntity> viewAll() {
        return repository.findAll();
    }

    @Override
    public void update(Rental rental) {
        if (repository.findById(rental.getRentId()).isPresent()){
            repository.save(
                    mapper.convertValue(rental, RentalEntity.class)
            );
        }
    }
}
