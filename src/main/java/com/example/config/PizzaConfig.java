package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.pizza.OnionPizza;
import com.example.pizza.Pizza;

@Configuration
public class PizzaConfig {

    @Bean
    Pizza onionPizza() {
		return new OnionPizza();
	}
}
