package web.servis;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Model1", 2021));
        cars.add(new Car("Model2", 2022));
        cars.add(new Car("Model3", 2023));
        cars.add(new Car("Model4", 2024));
        cars.add(new Car("Model5", 2020));
    }

    public List<Car> getCars(int count) {
        if (count>=cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
