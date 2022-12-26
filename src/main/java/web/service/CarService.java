
package web.service;

import web.model.Car;
import java.util.List;

public interface CarService {

    List<Car> getAllCarList();

    List<Car> getCarListByCount(List<Car> carList, int count);
}