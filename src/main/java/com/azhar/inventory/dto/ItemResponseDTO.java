package com.azhar.inventory.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponseDTO {

    private Long id;
    private String name;
    private double price;
    private int quantity;

    // public ItemResponseDTO(Long id, String name, double price, int quantity) {
    //     this.id = id;
    //     this.name = name;
    //     this.price = price;
    //     this.quantity = quantity;
    // }
    // getters & setters
}
