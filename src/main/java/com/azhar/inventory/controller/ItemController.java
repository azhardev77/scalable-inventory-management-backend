package com.azhar.inventory.controller;
return itemService.getAllItems(page, size);
import com.azhar.inventory.model.Item;
import com.azhar.inventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;




@GetMapping("/{id}")
public Item getById(@PathVariable Long id) {
return itemService.getItemById(id);
}


@PutMapping("/{id}")
public Item update(@PathVariable Long id, @Valid @RequestBody Item item) {
return itemService.updateItem(id, item);
}


@DeleteMapping("/{id}")
public void delete(@PathVariable Long id) {
itemService.deleteItem(id);
}


@PostMapping
public Item create(@RequestBody Item item) {
return itemService.createItem(item);
}


@GetMapping
public List<Item> getAll() {
return itemService.getAllItems();
}


@GetMapping("/{id}")
public Item getById(@PathVariable Long id) {
return itemService.getItemById(id);
}


@PutMapping("/{id}")
public Item update(@PathVariable Long id, @RequestBody Item item) {
return itemService.updateItem(id, item);
}


@DeleteMapping("/{id}")
public void delete(@PathVariable Long id) {
itemService.deleteItem(id);
}
