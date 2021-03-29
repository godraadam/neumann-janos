package dev.godraadam.restman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.godraadam.restman.model.restaurant.Reservation;
import dev.godraadam.restman.repo.ReservationRepo;

@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepo reservationRepo;

    public Reservation addReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

}
