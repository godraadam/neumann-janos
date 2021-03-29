package dev.godraadam.restman.model.restaurant;

import javax.persistence.Embeddable;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.URL;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
@Embeddable
public class RestaurantContact {
    private @Email String email;
    private String mobileNumber;
    private String landLineNumber;
    private @URL String webSite;
    
}
