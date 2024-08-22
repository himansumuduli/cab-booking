package com.example.GetRide.model;

import com.example.GetRide.Enum.Gender;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "custome")
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
     String name;
     int age;
     @Column(unique = true,nullable = false)
     String emailId;
     @Enumerated(EnumType.STRING)
     Gender gender;

     @OneToMany(mappedBy = "customer")
     List<Booking> bookings;



}
