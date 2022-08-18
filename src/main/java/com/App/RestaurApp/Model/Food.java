package com.App.RestaurApp.Model;

import javax.persistence.*;

@Entity
@Table(name="foods")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    private String price;
    @ManyToOne
    private Restaurant restaurant;
    
}
