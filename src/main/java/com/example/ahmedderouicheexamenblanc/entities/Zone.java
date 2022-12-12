package com.example.ahmedderouicheexamenblanc.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Zone {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String ref;
    private float dimension;
    @OneToMany
    private List<Personnel> personnel;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("parking")
    private Parking parking;

    @OneToOne
    private Personnel responsable;


}

