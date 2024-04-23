package com.example.demo.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Model;


@CrossOrigin(origins = "http://localhost:4200")
@RestController

//Baseroute for Controller
@RequestMapping("/model")
public class Controller {
	
	@GetMapping("/{modelName}/{modelAdress}")
    public Model getModelDetails(@PathVariable String modelName, @PathVariable String modelAdress) {
        return new Model(modelName, modelAdress);
        //http:localhost:8080/model/Max/Berlin
        //Correct URL
        //Output: {"modelName":"Max","modelAdress":"Berlin"}
	}
}

