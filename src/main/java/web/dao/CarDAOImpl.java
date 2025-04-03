package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    public CarDAOImpl() {
        this.cars = new ArrayList<>();
        initializeCars();
    }

    private void initializeCars() {
        cars.add(new Car("Model1", 2021));
        cars.add(new Car("Model2", 2022));
        cars.add(new Car("Model3", 2023));
        cars.add(new Car("Model4", 2024));
        cars.add(new Car("Model5", 2020));
    }

    @Override
    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(cars.subList(0, Math.min(count, cars.size())));
    }
}