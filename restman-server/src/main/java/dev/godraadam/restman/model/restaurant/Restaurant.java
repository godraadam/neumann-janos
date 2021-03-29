package dev.godraadam.restman.model.restaurant;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import dev.godraadam.restman.model.BaseModel;
import dev.godraadam.restman.model.GeoLocation;
import dev.godraadam.restman.model.menu.MenuItem;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "restaurants")
@Getter
@Setter
public class Restaurant extends BaseModel {
    
    private @NotNull GeoLocation geoLocation;
    private Set<RestaurantCategory> categories;
    private @NotBlank String name;
    private Address address;
    private RestaurantSchedule schedule;
    private RestaurantContact contact;
    private PriceRange priceRange;
    private @DBRef(lazy = true) Set<Reservation> reservations;
    private @DBRef(lazy = true) Set<Table> tables;
    private Set<MenuItem> menu;
}
