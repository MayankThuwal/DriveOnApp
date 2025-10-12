package com.driveon.driveOnApp.dto;

import com.driveon.driveOnApp.entity.enums.PaymentMethod;
import com.driveon.driveOnApp.entity.enums.RideRequestStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDTO {

    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RiderDTO rider;

    private PaymentMethod paymentMethod;

    private RideRequestStatus rideRequestStatus;
}
