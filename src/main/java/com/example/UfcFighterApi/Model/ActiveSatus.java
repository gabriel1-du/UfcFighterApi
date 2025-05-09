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

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ActiveSatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_activeStatus;

    //Connection with Fighter
    @OneToMany(mappedBy = "ActiveStatus", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Fighter> Fighters;


}
