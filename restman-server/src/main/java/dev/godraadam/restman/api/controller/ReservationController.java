package dev.godraadam.restman.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.godraadam.restman.api.assembler.ReservationAssembler;
import dev.godraadam.restman.api.dto.ReservationDTO;
import dev.godraadam.restman.model.restaurant.Reservation;
import dev.godraadam.restman.service.ReservationService;
import dev.godraadam.restman.service.RestaurantService;
import dev.godraadam.restman.service.UserService;

@RestController
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private ReservationAssembler reservationAssembler;
    
    @PostMapping("/api/reservation")
    public void addReservation(@RequestBody ReservationDTO reservationDTO) {
        
        Reservation reservation = reservationService.addReservation(reservationAssembler.createModel(reservationDTO));
        userService.addReservationForUser(reservationDTO.getUserId(), reservation.getId());
        restaurantService.addReservation(reservationDTO.getRestaurantId(), reservation);

    }

}
