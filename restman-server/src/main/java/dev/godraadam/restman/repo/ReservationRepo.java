package dev.godraadam.restman.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.godraadam.restman.model.restaurant.Reservation;

public interface ReservationRepo extends MongoRepository<Reservation, String> {
    
}
