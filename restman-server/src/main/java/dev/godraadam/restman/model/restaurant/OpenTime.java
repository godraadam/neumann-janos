package dev.godraadam.restman.model.restaurant;

import java.time.LocalTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OpenTime {

    private LocalTime openingTime;
    private LocalTime closingTime;
    
}
