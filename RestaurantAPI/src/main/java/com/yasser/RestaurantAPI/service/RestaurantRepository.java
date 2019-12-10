package com.yasser.RestaurantAPI.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasser.RestaurantAPI.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
	List<Restaurant> findByClosedFalse();

}
