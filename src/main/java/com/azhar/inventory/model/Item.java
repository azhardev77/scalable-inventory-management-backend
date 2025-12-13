package com.azhar.inventory.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


        @Entity
        @Table(name = "items")
        public class Item {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @NotBlank(message = "Item name must not be blank")
        @Column(nullable = false)
        private String name;


        @Min(value = 0, message = "Quantity must be >= 0")
        private int quantity;


        @Min(value = 0, message = "Price must be >= 0")
        private double price;


        public Item() {}


// getters and setters
}


    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
}

