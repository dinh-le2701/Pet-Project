package com.spring.restaurant.service;

import com.spring.restaurant.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {

    List<Booking> getBookings();

    Booking saveBooking(Booking booking);
    void deleteBooking(Long id);
}
