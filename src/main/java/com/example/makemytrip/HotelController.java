package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @GetMapping("/hotel")
    public String getHotelData() {
        return "Please book hotel from MMT, 75% discount in North India";
    }

    @GetMapping("/flight")
    public String getFlightData() {
        return "Book your flights with MMT, special discounts available";
    }

    @PutMapping("/hotels")
    public String updateData() {
        return "Update the hotel data";
    }
}
