package com.azhar.inventory.service;


        public Item createItem(Item item) {
        return itemRepository.save(item);
        }


        public Page<Item> getAllItems(int page, int size) {
        return itemRepository.findAll(PageRequest.of(page, size));
        }


        public Item getItemById(Long id) {
        return itemRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Item not found with id: " + id));
        }


        public Item updateItem(Long id, Item updatedItem) {
        Item existing = getItemById(id);
        existing.setName(updatedItem.getName());
        existing.setQuantity(updatedItem.getQuantity());
        existing.setPrice(updatedItem.getPrice());
        return itemRepository.save(existing);
        }


        public void deleteItem(Long id) {
        if (!itemRepository.existsById(id)) {
        throw new ResourceNotFoundException("Item not found with id: " + id);
        }
        itemRepository.deleteById(id);
        }



        public Item createItem(Item item) {
        return itemRepository.save(item);
        }


        public List<Item> getAllItems() {
        return itemRepository.findAll();
        }


        public Item getItemById(Long id) {
        return itemRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Item not found"));
        }


        public Item updateItem(Long id, Item updatedItem) {
        Item existing = getItemById(id);
        existing.setName(updatedItem.getName());
        existing.setQuantity(updatedItem.getQuantity());
        existing.setPrice(updatedItem.getPrice());
        return itemRepository.save(existing);
        }


        public void deleteItem(Long id) {
        itemRepository.deleteById(id);
}
