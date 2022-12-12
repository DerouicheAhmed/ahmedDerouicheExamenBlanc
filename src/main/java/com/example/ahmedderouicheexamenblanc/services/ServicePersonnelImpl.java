package com.example.ahmedderouicheexamenblanc.services;

import com.example.ahmedderouicheexamenblanc.entities.Personnel;
import com.example.ahmedderouicheexamenblanc.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePersonnelImpl implements IPersonnelInterface{
@Autowired
    PersonnelRepository personnelRepository;
    @Override
    public Personnel ajouterPersonnel(Personnel personnel) {
        try {
            return personnelRepository.save(personnel);
        } catch (Exception E) {
            System.out.println("Erreur : " + E);
        }
        return personnel;
    }
}
