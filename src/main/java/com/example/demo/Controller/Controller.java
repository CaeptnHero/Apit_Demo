package com.example.demo.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Model;


@CrossOrigin(origins = "http://localhost:4200")
@RestController

//Baseroute for Controller
@RequestMapping("/model")
public class Controller {
	
	@GetMapping
    public Model getModelDetails() {
        return new Model("Max", "Berlin");
        //http:localhost:8080/model
        //Correct URL
        //Output: {"modelName":"Max","modelAdress":"Berlin"}
	}
}

