package com.azhar.inventory.service;

import com.azhar.inventory.dto.ItemRequestDTO;
import com.azhar.inventory.dto.ItemResponseDTO;
import com.azhar.inventory.model.Item;
import com.azhar.inventory.repository.ItemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

        public ItemResponseDTO getItemById(Long id) {

            Item item = itemRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException(
                    "Item not found with id: " + id
            ));
    return mapToResponse(item);
}


    public ItemResponseDTO createItem(ItemRequestDTO dto) {

        Item item = new Item();
        item.setName(dto.getName());
        item.setPrice(dto.getPrice());
        item.setQuantity(dto.getQuantity());

        Item saved = itemRepository.save(item);

        return new ItemResponseDTO(
                saved.getId(),
                saved.getName(),
                saved.getPrice(),
                saved.getQuantity()
        );
    }

    public ItemResponseDTO updateItem(Long id, ItemRequestDTO dto) {
        Item item = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));

        item.setName(dto.getName());
        item.setPrice(dto.getPrice());
        item.setQuantity(dto.getQuantity());

        return mapToResponse(itemRepository.save(item));
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    public List<ItemResponseDTO> getAllItems(int page, int size) {
        Page<Item> items = itemRepository.findAll(PageRequest.of(page, size));
        return items.stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    private ItemResponseDTO mapToResponse(Item item) {
        return new ItemResponseDTO(
                item.getId(),
                item.getName(),
                item.getPrice(),
                item.getQuantity()
        );
    }
}
