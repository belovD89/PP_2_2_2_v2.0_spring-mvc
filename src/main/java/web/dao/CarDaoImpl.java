package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carsList = new ArrayList<>();
    public List<Car> listCars(Integer count) {
        carsList.add(new Car("CAR_1", "SERIAL_1", 2020));
        carsList.add(new Car("CAR_2", "SERIAL_2", 2021));
        carsList.add(new Car("CAR_3", "SERIAL_3", 2022));
        carsList.add(new Car("CAR_4", "SERIAL_4", 2023));
        carsList.add(new Car("CAR_5", "SERIAL_5", 2024));

        return carsList.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >=0 ) {
        return carsList;}
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
