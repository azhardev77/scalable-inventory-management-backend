package com.azhar.inventory.controller;
import com.azhar.inventory.model.Item;
import com.azhar.inventory.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;
    public ItemController(ItemService itemService) {
        this.itemService = itemService;    }
    @PostMapping
    public Item create(@Valid @RequestBody Item item) {
        return itemService.createItem(item);    }
    @GetMapping
    public Page<Item> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return itemService.getAllItems(page, size);    }
    @GetMapping("/{id}")
    public Item getById(@PathVariable Long id) {
        return itemService.getItemById(id);    }
    @PutMapping("/{id}")
    public Item update(@PathVariable Long id,
                       @Valid @RequestBody Item item) {
        return itemService.updateItem(id, item);    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        itemService.deleteItem(id);    }
}