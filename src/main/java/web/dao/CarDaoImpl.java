package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static List<Car> carList;

    public CarDaoImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("CAR_1", "SERIAL_1", 2020));
        carList.add(new Car("CAR_2", "SERIAL_2", 2021));
        carList.add(new Car("CAR_3", "SERIAL_3", 2022));
        carList.add(new Car("CAR_4", "SERIAL_4", 2023));
        carList.add(new Car("CAR_5", "SERIAL_5", 2024));
    }

//    @Override
//    public List<Car> getListCars(int count) {
//        return IntStream.range(0, carList.size())
//                .filter(l -> l < count)
//                .mapToObj(carList::get)
//                .toList();
//    }

    @Override
    public List<Car> getListCars(int count) {
        if (count == 0 || count > 5) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());

    }
}
