package com.azhar.inventory.dto;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ItemRequestDTO {

    private String name;
    private double price;
    private int quantity;

    // @Schema(example = "Laptop")
    // private String name;
    // @Schema(example = "75000")
    // private double price;
    // @Schema(example = "10")
    // private int quantity;
    // public String getName() {
    //     return name;
    // }
    // public Double getPrice() {
    //     return price;
    // }
    // public Integer getQuantity() {
    //     return quantity;
    // }
}
