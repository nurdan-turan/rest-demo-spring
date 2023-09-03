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
}