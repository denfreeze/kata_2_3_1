package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 12, "black"));
        cars.add(new Car("VOLVO", 5, "blue"));
        cars.add(new Car("JEEP", 1, "red"));
        cars.add(new Car("AUDI", 3, "white"));
        cars.add(new Car("DODGE", 1, "brown"));
    }

    @Override
    public List<Car> index(int count) {
        if (count >= cars.size()) {
            return new ArrayList<>(cars);
        }
        return new ArrayList<>(cars.subList(0, count));
    }
}
