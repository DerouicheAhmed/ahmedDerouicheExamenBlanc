package com.example.ahmedderouicheexamenblanc.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Parking {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String designation;
    private String adresse;
    private int capacité;
    @OneToMany(mappedBy = "parking")
    @JsonIgnoreProperties("zone")
    private Set<Zone> zones;
}
