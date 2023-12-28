package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp {
    private final CarDaoImpl carDao;

    public CarServiceImp(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    public List<Car> printCar(int count) {
        return carDao.getListCars(count);
    }
}
