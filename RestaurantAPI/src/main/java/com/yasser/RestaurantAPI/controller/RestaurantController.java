package com.yasser.RestaurantAPI.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.RestaurantAPI.model.Restaurant;
import com.yasser.RestaurantAPI.service.RestaurantService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;
	@GetMapping("/restaurant")
	public List<Restaurant> getAllRestaurant(){
		return restaurantService.getAllRestaurant();
	}
	@GetMapping("/restaurant?closed=0")
	public List<Restaurant> getOpenRestaurant(){
		return restaurantService.getOpenRestaurant();
	}
	@PostMapping("/restaurant")
	public void addRestaurant( @RequestBody Restaurant restaurant) {
		restaurantService.addRestaurant(restaurant);
	}
	@PutMapping("/restaurant/{uuid}")
	public void updateRestaurant(@RequestBody Restaurant restaurant , @PathVariable UUID uuid) {
		restaurantService.updateRestaurant(restaurant, uuid);
	}
}
