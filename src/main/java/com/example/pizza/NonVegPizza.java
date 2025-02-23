package com.example.pizza;

import org.springframework.stereotype.Component;

@Component("nonVegPizza")
public class NonVegPizza implements Pizza {
	
	@Override
	public String getPizza() {
		return "Non-Veg Pizza";
	}
}
