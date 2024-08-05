package com.example.GetRide.model;

import com.example.GetRide.Enum.BookingStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
