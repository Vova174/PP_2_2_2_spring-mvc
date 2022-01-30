package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.service.CarService;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {

    @GetMapping()
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "bmw", 1));
        cars.add(new Car(2, "MERCEDES", 200));
        cars.add(new Car(3, "zhiguli", 2101));
        cars.add(new Car(4, "lada", 12));
        cars.add(new Car(5, "range", 5));
        cars = CarService.show(cars,allCars);
        model.addAttribute("cars",cars);
        return "cars";
    }

}
