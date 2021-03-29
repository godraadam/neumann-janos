package dev.godraadam.restman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.godraadam.restman.model.restaurant.Reservation;
import dev.godraadam.restman.model.user.ApplicationUser;
import dev.godraadam.restman.repo.ReservationRepo;
import dev.godraadam.restman.repo.UserRepo;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ReservationRepo reservationRepo;
    
    public void addReservationForUser(String userId, String reservationId) {
        ApplicationUser user = userRepo.findById(userId).orElseThrow();
        Reservation reservation = reservationRepo.findById(reservationId).orElseThrow();
        user.getReservations().add(reservation);
        userRepo.save(user);
    }

}
