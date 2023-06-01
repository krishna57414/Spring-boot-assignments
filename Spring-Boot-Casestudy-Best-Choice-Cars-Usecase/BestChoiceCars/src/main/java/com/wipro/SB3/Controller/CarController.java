package com.wipro.SB3.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.SB3.Car;
import com.wipro.SB3.dao.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {
    
    @Autowired
    private CarRepository carRepository;
    
    @GetMapping("/")
    public String home() {
        return "Welcome to Best Choice - Cars";
    }
    
    @GetMapping("/searchByBrand")
    public ModelAndView searchByBrand() {
        ModelAndView modelAndView = new ModelAndView("searchByBrand");
        List<String> brands = carRepository.findDistinctBrands();
        modelAndView.addObject("brands", brands);
        return modelAndView;
    }
    
    @GetMapping("/searchByPrice")
    public ModelAndView searchByPrice() {
        return new ModelAndView("searchByPrice");
    }
    
    @GetMapping("/searchByBrand/results")
    public ModelAndView searchByBrandResults(@RequestParam("brand") String brand) {
        ModelAndView modelAndView = new ModelAndView("searchResults");
        List<Car> cars = carRepository.findByBrand(brand);
        modelAndView.addObject("cars", cars);
        return modelAndView;
    }
    
    @GetMapping("/searchByPrice/results")
    public ModelAndView searchByPriceResults(@RequestParam("minPrice") int minPrice, @RequestParam("maxPrice") int maxPrice) {
        ModelAndView modelAndView = new ModelAndView("searchResults");
        List<Car> cars = carRepository.findByPriceBetween(minPrice, maxPrice);
        modelAndView.addObject("cars", cars);
        return modelAndView;
    }
    
    @GetMapping("/carDetails/{id}")
    public ModelAndView carDetails(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("carDetails");
        Optional<Car> carOptional = carRepository.findById(id);
        if (carOptional.isPresent()) {
            Car car = carOptional.get();
            modelAndView.addObject("car", car);
        }
        return modelAndView;
    }
    
    @PostMapping("/book")
    public String bookCar() {
        // Logic to book the car
        return "Car booked successfully!";
    }
}
