package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private Long role;
    private String password;

    @ManyToOne
    @JoinColumn
    private Groups groups;
}
