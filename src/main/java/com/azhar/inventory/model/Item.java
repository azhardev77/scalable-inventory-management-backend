package com.azhar.inventory.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
@Entity
@Table(name = "items")
public class Item {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotBlank(message = "Item name is required")
        private String name;
        @NotNull(message = "Price is required")
        @Positive(message = "Price must be greater than 0")
        private Double price;
        @NotNull(message = "Quantity is required")
        @Positive(message = "Quantity must be greater than 0")
        private Integer quantity;
        public Item() {
        }
        public Item(String name, int quantity, double price) {
                this.name = name;
                this.quantity = quantity;
                this.price = price;
        }

        // getters and setters
}
