package com.example.demo.Model;

public class Model {
	
	//Variables for Controller
	private String modelName;
	private String modelAdress;
	
	
	// empty constructor
	public Model() {
	}


	public Model(String modelName, String modelAdress) {
		this.modelName = modelName;
		this.modelAdress = modelAdress;
	}
	
	
	//Getter and Setter Methods
	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getModelAdress() {
		return modelAdress;
	}


	public void setModelAdress(String modelAdress) {
		this.modelAdress = modelAdress;
	}
}