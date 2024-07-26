package edu.icet.rental_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Long itemId;
    private String name;
    private Boolean isAvailable;
    private int rentalPerDay;
    private int finePerDay;
}
