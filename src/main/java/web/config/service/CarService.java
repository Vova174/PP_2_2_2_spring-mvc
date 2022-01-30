package web.config.service;

import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService  {
    public static List<Car> show(List<Car> cars, int count) {
        if (count == 0 || count > 5) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

