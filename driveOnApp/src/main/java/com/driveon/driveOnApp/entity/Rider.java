package com.driveon.driveOnApp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Rider extends BaseEntity{

    @OneToOne
    @JoinColumn(name = "auth_user_Id")
    private User user;

    private Double rating;
}
