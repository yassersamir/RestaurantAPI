package com.yasser.RestaurantAPI.error;

import java.util.UUID;

public class RestaurantNotFoundExeption extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public RestaurantNotFoundExeption (String message,UUID id) {
		super(message+id);
	}

}
