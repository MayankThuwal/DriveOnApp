package com.driveon.driveOnApp.entity;

import com.driveon.driveOnApp.entity.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Table(name = "auth_user")
@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // To generate id when every a user entity is created
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.ORDINAL) // To Set enum type as ordinal as 0,1,2
    private Set<Role> roles;
}
