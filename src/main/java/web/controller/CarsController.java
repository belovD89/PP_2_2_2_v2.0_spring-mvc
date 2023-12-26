package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarsController {
    private final CarServiceImp carServiceImp;

    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String getParam (@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        model.addAttribute("carList",  carServiceImp.printCar(count));
        return "car";
    }
}
