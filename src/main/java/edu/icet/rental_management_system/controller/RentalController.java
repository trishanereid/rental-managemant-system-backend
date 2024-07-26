package edu.icet.rental_management_system.controller;

import edu.icet.rental_management_system.bo.RentalBo;
import edu.icet.rental_management_system.dto.Rental;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/v4")
public class RentalController {
    final RentalBo rentalBo;

    @PostMapping("/add-rent")
    public void add(@RequestBody Rental rental){
        rentalBo.addRent(rental);
    }

    @GetMapping("/search-rent-by-id/{rentId}")
    public Rental findCustomerById(@PathVariable Long rentId){
        return rentalBo.searchById(rentId);
    }

    @DeleteMapping("/delete-rental/{rentId}")
    public void deleteById(@PathVariable Long rentId){
        rentalBo.deleteById(rentId);
    }

    @GetMapping("/view Rentals")
    public void viewRental(){
        rentalBo.viewAll();
    }
}
