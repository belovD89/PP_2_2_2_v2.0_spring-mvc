package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;

@Controller
public class CarsController {
    private final CarDao carDao;
    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String getParam(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        model.addAttribute("carList", carDao.getListCars(count));
        return "car";
    }
}
