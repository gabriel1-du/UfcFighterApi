package com.example.UfcFighterApi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Fighter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nickname;

    @ManyToOne
    @JoinColumn(name= "id_country")
    private String nationality;

    private String division;     // e.g., lightweight, welterweight
    private Double height;       // in meters
    private Double weight;       // in kilograms
    private Double reach;        // in meters
    private int wins;
    private int losses;
    private int draws;
    private int knockouts;
    private int submissions;
    private boolean active;


}
