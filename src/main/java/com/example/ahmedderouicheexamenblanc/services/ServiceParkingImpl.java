package com.example.ahmedderouicheexamenblanc.services;

import com.example.ahmedderouicheexamenblanc.entities.Parking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/personnel")
@RestController
public class ServiceParkingImpl implements IParkingInterface{
    @Override
    public void ajoutParkingetZones(Parking parking) {



    }
}
