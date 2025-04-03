package web.servis;

import web.dao.CarDAO;
import web.model.Car;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {
    private final CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getCars(Integer count) {
        if (count == null) {
            return carDAO.getAllCars();
        }
        return carDAO.getCars(count);
    }
}