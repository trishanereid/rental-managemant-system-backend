package edu.icet.rental_management_system.bo;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.rental_management_system.dto.Customer;
import edu.icet.rental_management_system.entity.CustomerEntity;
import edu.icet.rental_management_system.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Service
public class CustomerBoImpl implements CustomerBo{
    final CustomerRepository repository;
    final ObjectMapper mapper;
    @Override
    public void add(Customer customer) {
        repository.save(
                mapper.convertValue(customer, CustomerEntity.class)
        );
    }

    @Override
    public void update(Customer customer) {
        if (repository.findById(customer.getCustomerId()).isPresent()){
            repository.save(
                    mapper.convertValue(customer, CustomerEntity.class)
            );
        }
    }

    @Override
    public Customer searchById(Long customerId) {
        CustomerEntity byCustomerId = repository.findByCustomerId(customerId);
        return mapper.convertValue(byCustomerId, Customer.class);
    }

    @Override
    public void deleteById(Long customerId) {
        repository.deleteById(customerId);
    }

    @Override
    public void delete(Customer customer) {
        repository.delete(
                mapper.convertValue(customer, CustomerEntity.class)
        );
    }


}
