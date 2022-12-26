
package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String viewCars (@RequestParam(value = "count", required = false) String count, Model model) {

        List<Car> carListToView;
        List<Car> allCarList = carService.getAllCarList();

        if (count == null){
            carListToView = allCarList;
        } else {
            carListToView = carService.getCarListByCount(allCarList, Integer.parseInt(count));
        }
        model.addAttribute("carList", carListToView);
        return "cars";
    }


}