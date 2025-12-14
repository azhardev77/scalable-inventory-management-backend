package com.azhar.inventory.controller;

import com.azhar.inventory.dto.ItemRequestDTO;
import com.azhar.inventory.dto.ItemResponseDTO;
import com.azhar.inventory.service.ItemService;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.List;

@RestController
@RequestMapping("/api/items")
@Tag(name = "Item Controller", description = "CRUD APIs for Inventory Items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @Operation(summary = "Get item by ID")
    @ApiResponse(responseCode = "200", description = "Item found")
    @ApiResponse(responseCode = "404", description = "Item not found")
    @GetMapping("/{id}")
   public ResponseEntity<ItemResponseDTO> getItem(
            @PathVariable Long id) {
        return ResponseEntity.ok(itemService.getItemById(id));
    }

    @Operation(summary = "Create new item", description = "Add a new inventory item")
    @PostMapping
    public ResponseEntity<ItemResponseDTO> createItem(
            @RequestBody ItemRequestDTO dto) {
        return ResponseEntity.ok(itemService.createItem(dto));
    }
    @PutMapping("/{id}")
    public ItemResponseDTO updateItem(
            @PathVariable Long id,
            @RequestBody ItemRequestDTO dto) {
        return itemService.updateItem(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemService.deleteItem(id);
    }

    @GetMapping
    public List<ItemResponseDTO> getAllItems(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return itemService.getAllItems(page, size);
    }
}
