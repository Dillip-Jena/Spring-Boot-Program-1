package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.pizza.Pizza;

@Controller
public class PizzaController {
	@Autowired
    private Pizza vegPizza;
	@Autowired
    private Pizza nonVegPizza;
	
	public PizzaController(Pizza vegPizza, Pizza nonVegPizza) {
		this.vegPizza = vegPizza;
		this.nonVegPizza = nonVegPizza;
	}


    public String getVegPizza() {
        return vegPizza.getPizza();
    }

    public String getNonVegPizza() {
        return nonVegPizza.getPizza();
    }
}