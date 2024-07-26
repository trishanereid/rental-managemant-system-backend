package edu.icet.rental_management_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rental")
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentId;
    private String rentDate;
    private String returnDate;
    private String dueDate;
    private String expectedDate;
    private Integer fine;
    private Integer totalCost;
}
