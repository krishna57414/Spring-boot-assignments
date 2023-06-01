package com.wipro.SB3.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.SB3.Car;
import com.wipro.SB3.dao.CarRepository;

@Service
public class CarService implements ServiceInterf{
	@Autowired
	CarRepository carRepository;
	@Override
    public List<Car> searchCarsByBrand(String brand) {
        return carRepository.findByBrand(brand);
    }
	@Override
    public List<Car> searchCarsByPriceRange(double minPrice, double maxPrice) {
        return carRepository.findByPriceBetween(minPrice, maxPrice);
    }
	public List<Car> getCarsByBrand(String brand) {
        return carRepository.findByBrand(brand);
    }

    public List<Car> getCarsByPriceRange(double minPrice, double maxPrice) {
        return carRepository.findByPriceBetween(minPrice, maxPrice);
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

}
