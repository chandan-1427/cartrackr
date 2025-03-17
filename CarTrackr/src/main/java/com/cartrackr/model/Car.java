package com.cartrackr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="CAR_DETAILS")
	public class Car {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		 private Long id;  // Unique identifier for the car

	    private String brand;  // Car brand (e.g., Benz)
	    private String model;  // Car model (e.g., C-Class, E-Class)
	    private int year;      // Car manufacturing year
	    private double price;  // Car price

	    // Constructor
	    public Car() {}

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
		
	}		




