package com.example.GetRide.model;

import com.example.GetRide.Enum.CabType;
import jakarta.persistence.*;
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

@OneToOne
 @JoinColumn
Driver driver;

}
