package dev.godraadam.restman.api.assembler;

import dev.godraadam.restman.api.dto.ReservationDTO;
import dev.godraadam.restman.model.restaurant.Reservation;

public class ReservationAssembler implements GeneralAssembler<ReservationDTO, Reservation> {

    @Override
    public ReservationDTO createDTO(Reservation model) {
        return null;
    }

    @Override
    public Reservation createModel(ReservationDTO dto) {
        return Reservation.builder().from(dto.getFrom()).to(dto.getTo()).nrOfCustomers(dto.getNrOfSeats()).build();
    }

}
