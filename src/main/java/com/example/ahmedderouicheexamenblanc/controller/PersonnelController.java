package com.example.ahmedderouicheexamenblanc.controller;

import com.example.ahmedderouicheexamenblanc.entities.Personnel;
import com.example.ahmedderouicheexamenblanc.services.IPersonnelInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/personnel")
@RestController
public class PersonnelController {
    @Autowired
    IPersonnelInterface iPersonnelInterface;

    @PostMapping("/ajout")
        public Personnel ajouterPersonnel(@ RequestBody Personnel personnel) {
            return iPersonnelInterface.ajouterPersonnel(personnel);

    }







}
