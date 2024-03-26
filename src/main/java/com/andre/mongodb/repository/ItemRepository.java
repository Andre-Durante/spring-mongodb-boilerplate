package com.andre.mongodb.repository;

import com.andre.mongodb.model.ItemEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<ItemEntity, String> {
}
