package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Model;

@RestController
@RequestMapping("/model")
public class Controller {
	
	//Object who gets the Values
	@GetMapping("/{modelName}/{modelAdress}")
	public Model getModelDetails(@PathVariable String modelName, @PathVariable String modelAdress) {
		return new Model("Max", "Berlin");

	}
}