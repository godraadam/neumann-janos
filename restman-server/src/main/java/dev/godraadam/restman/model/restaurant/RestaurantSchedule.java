package dev.godraadam.restman.model.restaurant;

import java.time.DayOfWeek;
import java.util.Map;

import javax.persistence.Embeddable;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
@Embeddable
public class RestaurantSchedule {
    
    private Map<DayOfWeek, OpenTime> schedule;
}
