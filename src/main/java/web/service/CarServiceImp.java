package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {


    @Override
    public List<Car> getCars(Integer count) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("CAR_1", "SERIAL_1", 2020));
        cars.add(new Car("CAR_2", "SERIAL_2", 2021));
        cars.add(new Car("CAR_3", "SERIAL_3", 2022));
        cars.add(new Car("CAR_4", "SERIAL_4", 2023));
        cars.add(new Car("CAR_5", "SERIAL_5", 2024));

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
