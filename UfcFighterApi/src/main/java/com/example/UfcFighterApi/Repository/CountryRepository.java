package com.example.UfcFighterApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UfcFighterApi.Model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
