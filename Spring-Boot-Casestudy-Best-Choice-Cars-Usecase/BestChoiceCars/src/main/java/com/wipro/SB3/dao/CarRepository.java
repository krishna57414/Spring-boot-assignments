package com.wipro.SB3.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.SB3.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByBrand(String brand);
    List<Car> findByPriceBetween(double minPrice, double maxPrice);
    
    @Query("SELECT DISTINCT c.brand FROM Car c")
    List<String> findDistinctBrands();
}
