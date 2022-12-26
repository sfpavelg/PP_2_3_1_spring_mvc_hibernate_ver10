package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getAllCarList() {
        return carDAO.getAllCarList();
    }

    @Override
    public List<Car> getCarListByCount(List<Car> carList, int count) {
        return carDAO.getCarListByCount(carList, count);
    }
}