package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 12, "black"));
        cars.add(new Car("VOLVO", 5, "blue"));
        cars.add(new Car("JEEP", 1, "red"));
        cars.add(new Car("AUDI", 3, "white"));
        cars.add(new Car("DODGE", 1, "brown"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
