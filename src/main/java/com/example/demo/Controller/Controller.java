package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Model;

@RestController

//Baseroute for Controller
@RequestMapping("/model")
public class Controller {
	
	//Object who gets the Values
		@GetMapping("/modelName")
		public Model getModelDetails(@PathVariable String modelName, @PathVariable String modelAdress) {
			return new Model("Max", "Berlin");
			//http://localhost:8080/model/modelname/Max
			//Correct URL		
			
	}
}
