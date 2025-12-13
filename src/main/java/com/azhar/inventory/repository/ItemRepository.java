package com.azhar.inventory.repository;


import com.azhar.inventory.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item, Long> {
}