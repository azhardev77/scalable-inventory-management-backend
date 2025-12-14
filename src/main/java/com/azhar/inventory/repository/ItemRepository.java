package com.azhar.inventory.repository;

import com.azhar.inventory.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {

    Optional<Item> findByName(String name);

    List<Item> findByNameContainingIgnoreCase(String name);
}
