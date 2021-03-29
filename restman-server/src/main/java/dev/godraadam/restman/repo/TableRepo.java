package dev.godraadam.restman.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.godraadam.restman.model.restaurant.Table;

@Repository
public interface TableRepo extends MongoRepository<Table, String>{
    
}
