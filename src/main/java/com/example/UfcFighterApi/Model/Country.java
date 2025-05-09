package com.example.UfcFighterApi.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_country;
    private String nameCountry;
    
    //Connection with Fighter class
    @OneToMany(mappedBy = "Country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Fighter> Fighters;


}
