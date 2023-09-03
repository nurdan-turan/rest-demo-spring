package com.booking.restdemo.model;

import java.util.Date;

public class Booking {
    String bookingId;
    String bookingName;
    String bookingEmail;
    String bookingPhone;
    String bookingDate;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public String getBookingEmail() {
        return bookingEmail;
    }

    public void setBookingEmail(String bookingEmail) {
        this.bookingEmail = bookingEmail;
    }

    public String getBookingPhone() {
        return bookingPhone;
    }

    public void setBookingPhone(String bookingPhone) {
        this.bookingPhone = bookingPhone;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }


    public Booking() {
    }

    public Booking(String bookingId, String bookingName, String bookingEmail, String bookingPhone, String bookingDate) {
        this.bookingId = bookingId;
        this.bookingName = bookingName;
        this.bookingEmail = bookingEmail;
        this.bookingPhone = bookingPhone;
        this.bookingDate = bookingDate;
    }
}
