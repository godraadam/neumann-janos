package dev.godraadam.restman.api.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@Jacksonized
public class ReservationDTO {
    
    private @NotNull LocalDateTime from;
    private LocalDateTime to;
    private String restaurantId;
    private String userId;
    private Integer nrOfSeats;

}
