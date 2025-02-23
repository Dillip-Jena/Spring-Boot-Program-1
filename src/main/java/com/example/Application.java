package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.controller.PizzaController;
import com.example.pizza.Pizza;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		//Get the PizzaConntroller bean
		PizzaController controller = context.getBean(PizzaController.class);
		
		//Get the onionPizza bean through config class
		Pizza onionPizza = context.getBean("onionPizza", Pizza.class);
		
		System.out.println("Veg Pizza (from controller): "+controller.getVegPizza());
		System.out.println("Non-Veg Pizza (from controller): "+controller.getNonVegPizza());
		System.out.println("Onion Pizza (from config): "+onionPizza.getPizza());
	}

}
