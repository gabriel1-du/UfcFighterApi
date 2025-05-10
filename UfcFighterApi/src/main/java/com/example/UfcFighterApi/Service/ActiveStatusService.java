package com.example.UfcFighterApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.UfcFighterApi.Model.ActiveSatus;
import com.example.UfcFighterApi.Repository.ActiveStatusRepository;

public class ActiveStatusService {

    @Autowired //inyection 
    private ActiveStatusRepository activeStatusRepository;

    //Get all ActiveSatus
    public List<ActiveSatus> getAll(){
        return activeStatusRepository.findAll();
    }

}
