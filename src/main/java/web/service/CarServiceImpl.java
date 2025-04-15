package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    public CarServiceImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("BMW", "X5", 2019));
        carList.add(new Car("Mercedes", "E-Class", 2021));
        carList.add(new Car("Audi", "A6", 2018));
        carList.add(new Car("Ford", "Mustang", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        return count >= carList.size() ? carList : carList.subList(0, count);
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
