package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    public CarDAOImpl() {
        this.cars = new ArrayList<>();
    }

    @Override
    public List<Car> getAllCars() {
        if (cars.isEmpty()) {
            initializeCars();
        }
        return Collections.unmodifiableList(cars);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return Collections.emptyList();
        }

        if (cars.isEmpty()) {
            initializeCars();
        }

        return Collections.unmodifiableList(
                cars.subList(0, Math.min(count, cars.size()))
        );
    }

    private void initializeCars() {
        cars.add(new Car("Model1", 2021));
        cars.add(new Car("Model2", 2022));
        cars.add(new Car("Model3", 2023));
        cars.add(new Car("Model4", 2024));
        cars.add(new Car("Model5", 2020));
    }
}