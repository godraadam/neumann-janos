package dev.godraadam.restman.model.restaurant;

import java.time.LocalDateTime;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import dev.godraadam.restman.model.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Document(collection = "reservations")
@Getter
@Setter
@SuperBuilder
public class Reservation extends BaseModel {

    private @NotNull LocalDateTime from;
    private LocalDateTime to;
    private @Positive Integer nrOfCustomers;
    private @NotBlank String customerName;
    private @DBRef Set<Table> reservedTables;
    
}
