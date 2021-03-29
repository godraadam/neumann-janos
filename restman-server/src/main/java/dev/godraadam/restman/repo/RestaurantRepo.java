package dev.godraadam.restman.repo;

import java.util.List;

import org.springframework.data.geo.Circle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.godraadam.restman.model.restaurant.Restaurant;

@Repository
public interface RestaurantRepo extends MongoRepository<Restaurant, String> {

    List<Restaurant> findByLocationWithin(Circle c);
}
