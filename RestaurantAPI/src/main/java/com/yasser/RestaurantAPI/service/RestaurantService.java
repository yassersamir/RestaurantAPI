package com.yasser.RestaurantAPI.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasser.RestaurantAPI.error.RestaurantNotFoundExeption;
import com.yasser.RestaurantAPI.model.Restaurant;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;
	public List<Restaurant> getAllRestaurant(){
		return restaurantRepository.findAll();
	}
	public List<Restaurant> getOpenRestaurant(){
		return restaurantRepository.findByClosedFalse();
	}
	public void addRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}
	public void updateRestaurant(Restaurant restaurant , UUID id) {
		restaurantRepository.findById(id)
							.map( restaurantFound ->{
								restaurantFound = restaurant;
								return restaurantRepository.save(restaurantFound);
							}).orElseThrow(() -> new RestaurantNotFoundExeption("couldn`t find restaurant  :", id));
	}
	
}
