package edu.icet.rental_management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rental {
    private Long rentId;
    private String rentDate;
    private String returnDate;
    private String dueDate;
    private String expectedDate;
    private Integer fine;
    private Integer totalCost;
}
