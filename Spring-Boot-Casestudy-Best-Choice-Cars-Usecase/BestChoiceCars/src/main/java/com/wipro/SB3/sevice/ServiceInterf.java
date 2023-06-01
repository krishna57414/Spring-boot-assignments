package com.wipro.SB3.sevice;

import java.util.List;

import com.wipro.SB3.Car;
import com.wipro.SB3.dao.CarRepository;

public interface ServiceInterf{
	public List<Car> searchCarsByBrand(String brand);
	public List<Car> searchCarsByPriceRange(double minPrice, double maxPrice);

}
