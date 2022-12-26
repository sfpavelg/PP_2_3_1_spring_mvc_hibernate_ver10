package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Zhiguli", 1980, 63));
        cars.add(new Car("Volga", 1968, 85));
        cars.add(new Car("Zaporozhec", 1979, 42));
        cars.add(new Car("Moskvich", 1976, 65));
        cars.add(new Car("Kombi", 1973, 70));
    }

    @Override
    public List<Car> getAllCarList() {
        return cars;
    }

    @Override
    public List<Car> getCarListByCount(List<Car> carList, int count) {

        return carList.stream().limit(count).collect(Collectors.toList());
    }


}
