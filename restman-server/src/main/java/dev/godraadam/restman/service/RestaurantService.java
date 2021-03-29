package dev.godraadam.restman.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import dev.godraadam.restman.model.GeoLocation;
import dev.godraadam.restman.model.restaurant.Reservation;
import dev.godraadam.restman.model.restaurant.Restaurant;
import dev.godraadam.restman.repo.RestaurantRepo;

@Service
public class RestaurantService {
    
    @Autowired
    private RestaurantRepo restaurantRepo;

    public void addReservation(String restaurantId, Reservation reservation) {
        Restaurant restaurant = restaurantRepo.findById(restaurantId).orElseThrow();
        restaurant.getReservations().add(reservation);
        restaurantRepo.save(restaurant);
    }

    public List<Restaurant> getNearbyRestaurants(GeoLocation location, Long radius) {
        return restaurantRepo.findByLocationWithin(new Circle(new Point(location.getLatitude(), location.getLongitude()), new Distance(radius, Metrics.KILOMETERS)));
    }
}
