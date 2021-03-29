package dev.godraadam.restman.model.restaurant;

import javax.validation.constraints.Positive;

import org.springframework.data.mongodb.core.mapping.Document;

import dev.godraadam.restman.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "tables")
@Getter
@Setter
public class Table extends BaseModel {
    
    private @Positive Integer nrOfSeats;
    private Boolean available;
}
