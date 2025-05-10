package com.example.UfcFighterApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UfcFighterApi.Model.Country;
import com.example.UfcFighterApi.Repository.CountryRepository;

@Service
public class CountryService {
    @Autowired //inyection 
    private CountryRepository countryRepository;

    //Get all fighters
    public List<Country> getAll(){
        return countryRepository.findAll(); 
    }


}
