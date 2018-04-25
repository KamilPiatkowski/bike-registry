package com.github.kamilpiatkowski.bikeregistry.repositories;

import com.github.kamilpiatkowski.bikeregistry.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {

}
