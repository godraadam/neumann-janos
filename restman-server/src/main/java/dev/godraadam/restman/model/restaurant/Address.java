package dev.godraadam.restman.model.restaurant;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Address {

    private String country;
    private String region;
    private String city;
    private String street;
    private String number;
    
}
