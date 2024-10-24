package com.example.GetRide.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name="coupon")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Coupon {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String couponCode;
    int percentageDiscount;


}
