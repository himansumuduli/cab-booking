package com.example.GetRide.model;

import com.example.GetRide.Enum.BookingStatus;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Booking {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String bookingId;
String pickup;
String destination;
BookingStatus bookingStatus;
double totalDistance;
double totalFare;
Date bookedAt;



@ManyToOne
@JoinColumn
Customer customer;

@ManyToOne
@JoinColumn
Driver driver;
}
