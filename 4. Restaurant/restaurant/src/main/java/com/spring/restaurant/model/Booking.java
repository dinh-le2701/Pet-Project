package com.spring.restaurant.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Entity(name = "Booking")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "booking_name")
    private String booking_name;

    @Column(name = "email")
    private String email;

    @Column(name = "date_booking")
    private Date date_booking;

    @Column(name = "num_people")
    private int num_people;

    @Column(name = "special_request")
    private String special_request;

    @Column(name = "create_at")
    @DateTimeFormat(pattern = "MM/dd/yyyy hh:mm a")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy hh:mm a")
    private LocalDateTime create_at;
}
