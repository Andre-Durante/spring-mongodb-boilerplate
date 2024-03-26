package com.andre.mongodb.service;


import com.andre.mongodb.model.ItemEntity;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<ItemEntity> findAllItems();

    Optional<ItemEntity> findItemById(String id);

    ItemEntity saveItem(ItemEntity item);

    void deleteItem(String id);

    ItemEntity updateItem(String id, ItemEntity itemDetails);
}