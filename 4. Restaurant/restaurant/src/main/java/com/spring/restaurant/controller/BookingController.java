package com.spring.restaurant.controller;

import com.spring.restaurant.model.Booking;
import com.spring.restaurant.service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/booking")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    private static Logger log = LoggerFactory.getLogger(BookingController.class);

    @GetMapping("")
    public ResponseEntity<List<Booking>> getBookings(){
        try {
            List<Booking> bookings = bookingService.getBookings();
            log.info("Get all booking complete!");
            return new ResponseEntity<>(bookings, HttpStatus.FOUND);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @PostMapping("")
    public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking){
        try {
            log.info(booking + "is saved!");
            return new ResponseEntity<>(booking, HttpStatus.CREATED);
        } catch (Exception e){
            log.warn("Save food has error" + e);
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable("id") Long id){
        try {
            bookingService.deleteBooking(id);
        } catch (Exception e){
            log.warn("Not found booking has id" + id + e);
        }
    }
}
