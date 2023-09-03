package com.booking.restdemo.controller;

import com.booking.restdemo.model.Booking;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/booking/api/v1")
public class BookingAPIService {
    Booking booking;

    @GetMapping("/{bookingId}")
    public Booking getBookingDetails(String bookingId) {
        return new Booking("1234",
                "Nurdan Turan",
                "nurdan.turan@gmail.com",
                "1234567890",
                "2025-01-01");
    }

    @PostMapping
    public String createBooking(@RequestBody Booking booking) {
        this.booking = booking;
        return "Booking created successfully";
    }

    @PutMapping
    public String updateBooking(@RequestBody Booking booking) {
        this.booking = booking;
        return "Booking updated successfully";
    }

    @DeleteMapping("/{bookingId}")
    public String deleteBooking(@PathVariable("bookingId") String bookingId) {
        this.booking = null;
        return "Booking deleted successfully";
    }

    @GetMapping("/health")
    public String health() {
        return "Booking API is up and running";
    }
}
