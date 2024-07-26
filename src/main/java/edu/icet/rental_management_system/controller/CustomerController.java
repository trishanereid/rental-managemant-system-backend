package edu.icet.rental_management_system.controller;

import edu.icet.rental_management_system.bo.CustomerBo;
import edu.icet.rental_management_system.dto.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/v4")
public class CustomerController {
    final CustomerBo customerBo;
    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer){
        customerBo.add(customer);
    }

    @PostMapping("/update-customer")
    public void update(@RequestBody Customer customer) {
        customerBo.update(customer);
    }

    @GetMapping("/search-customer-by-id/{customerId}")
    public Customer findCustomerById(@PathVariable Long customerId){
        return customerBo.searchById(customerId);
    }

    @DeleteMapping("/delete-customer/{customerId}")
    public void deleteById(@PathVariable Long customerId){
        customerBo.deleteById(customerId);
    }

    @DeleteMapping("/delete-customer")
    public void delete(@RequestBody Customer customer){
        customerBo.delete(customer);
    }
}
