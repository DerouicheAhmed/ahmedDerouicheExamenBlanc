package com.example.ahmedderouicheexamenblanc.repository;

import com.example.ahmedderouicheexamenblanc.entities.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkinRepository  extends JpaRepository<Parking,Integer> {
}
