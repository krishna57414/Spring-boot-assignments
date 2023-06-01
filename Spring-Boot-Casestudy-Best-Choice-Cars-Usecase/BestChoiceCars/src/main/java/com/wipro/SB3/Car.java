package com.wipro.SB3;

import javax.persistence.*;


@Entity
@Table(name="cars")
public class Car {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private int year;
    private int kms;
    private double price;
    private String fuel;
	public Car(Long id, String brand, String model, int year, int kms, double price, String fuel) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.kms = kms;
		this.price = price;
		this.fuel = fuel;
	}
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
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
