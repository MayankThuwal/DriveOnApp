package com.driveon.driveOnApp.entity;

import com.driveon.driveOnApp.entity.enums.PaymentMethod;
import com.driveon.driveOnApp.entity.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RideRequest extends BaseEntity {

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.ORDINAL)
    private RideRequestStatus rideRequestStatus;
}