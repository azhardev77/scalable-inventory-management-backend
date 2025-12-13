package com.azhar.inventory.service;

import com.azhar.inventory.model.Item;
import com.azhar.inventory.repository.ItemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Page<Item> getAllItems(int page, int size) {
        return itemRepository.findAll(PageRequest.of(page, size));
    }

    public Item createItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        return itemRepository.save(item);
    }

    public Item getItemById(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public Item updateItem(Long id, Item item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }   

}
