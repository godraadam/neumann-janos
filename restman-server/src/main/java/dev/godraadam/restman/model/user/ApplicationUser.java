package dev.godraadam.restman.model.user;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import dev.godraadam.restman.model.BaseModel;
import dev.godraadam.restman.model.restaurant.Reservation;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Document(collection = "users")
@Getter
@Setter
@SuperBuilder
public class ApplicationUser extends BaseModel {
    
    private @Length(min = 2, max = 30) String firstName;
    private @Length(min = 2, max = 30) String lastName;
    private @NotNull String password;
    private @Email String email;
    private UserRole role;
    private @DBRef List<Reservation> reservations;
}
