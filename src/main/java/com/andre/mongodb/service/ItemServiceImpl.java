package com.andre.mongodb.service;

import com.andre.mongodb.model.ItemEntity;
import com.andre.mongodb.repository.ItemRepository;
import com.andre.mongodb.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<ItemEntity> findAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<ItemEntity> findItemById(String id) {
        return itemRepository.findById(id);
    }

    @Override
    public ItemEntity saveItem(ItemEntity item) {
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }

    @Override
    public ItemEntity updateItem(String id, ItemEntity itemDetails) {
        return itemRepository.findById(id)
                .map(item -> {
                    item.setName(itemDetails.getName());
                    item.setDescription(itemDetails.getDescription());
                    return itemRepository.save(item);
                }).orElseThrow(() -> new RuntimeException("Item not found with id " + id));
    }
}