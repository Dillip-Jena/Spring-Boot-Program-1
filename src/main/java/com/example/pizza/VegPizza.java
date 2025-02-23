package com.example.pizza;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("vegPizza")
@Primary
public class VegPizza implements Pizza{
	
	@Override
	public String getPizza() {
		return "Veg-Pizza";
	}
}
