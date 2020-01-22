package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private int role_id;
    @Column(name = "role")
    private String role;
}
