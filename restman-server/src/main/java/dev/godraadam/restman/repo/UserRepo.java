package dev.godraadam.restman.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.godraadam.restman.model.user.ApplicationUser;

@Repository
public interface UserRepo extends MongoRepository<ApplicationUser, String>{
    
}
