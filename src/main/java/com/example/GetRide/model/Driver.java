package com.example.GetRide.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.logging.Level;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "driver")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;
    @Column(unique = true,nullable = false)
    String drivingLicense;
    @Column(unique = true,nullable = false)
    long number;



}
