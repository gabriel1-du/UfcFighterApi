package com.example.UfcFighterApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.UfcFighterApi.Model.Fighter;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Integer> {

}
