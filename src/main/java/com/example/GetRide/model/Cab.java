package com.example.GetRide.model;

import com.example.GetRide.Enum.CabType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cab {
  @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
int id;

String cabNumer;

CabType cabType;

double fareperkm;

boolean booked;
}
