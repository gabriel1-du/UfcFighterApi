package com.example.UfcFighterApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UfcFighterApi.Model.Fighter;
import com.example.UfcFighterApi.Repository.FighterRepository;

@Service
public class FighterService {

    @Autowired //inyection 
    private FighterRepository fighterRepository;

    //Get all fighters
    public List<Fighter> getAll(){
        return fighterRepository.findAll(); 
    }






}
