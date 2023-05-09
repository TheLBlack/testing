package project;

import java.util.Comparator;
import java.util.List;

public class Task5CarService {

    private List<Task5Car> cars;

    public Task5CarService(List<Task5Car> cars) {
        this.cars = cars;
    }

    public void addCar(Task5Car car) {
        cars.add(car);
    }

    public void removeCar(Task5Car car) {
        cars.remove(car);
    }

    public List<Task5Car> getListOfCars() {
        return cars;
    }

    public List<Task5Car> carsWithV12Engines() {
        return cars.stream()
                .filter(car -> car.getEngineType() == Task5EngineType.V12)
                .toList();
    }

    public List<Task5Car> carsBeforeYear1999() {
        return cars.stream()
                .filter(car -> car.getYearOfProduction() < 1999)
                .toList();
    }

    public Task5Car getMostExpensiveCar() {
        return cars.stream()
                .sorted(Comparator.comparingInt(Task5Car::getPrice).reversed()).findFirst().get();
    }

    public Task5Car getMostExpensiveCarMax() {
        return cars.stream().max(Comparator.comparingInt(Task5Car::getPrice)).get();
    }

    public Task5Car getTheCheapestCar() {
        return cars.stream().min(Comparator.comparingInt(Task5Car::getPrice)).get();
    }

    public List<Task5Car> getCarsWithAtLeastThreeManufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturerList().size() >= 3)
                .toList();
    }

    public List<Task5Car> sortCars(boolean ascending) {
        Comparator<Task5Car> c = Comparator.comparing(Task5Car::getName);
        if (!ascending) c = c.reversed();

        return cars.stream()
                .sorted(c)
                .toList();
    }

    public boolean isCarOnTheList(String name) {
        for (Task5Car car : cars) {
            if (name.equalsIgnoreCase(car.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isCarOnTheList(Task5Car car) {
        return cars.contains(car);
    }

    public List<Task5Car> getCarByManufacturer(Task5Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .toList();
    }

    public List<Task5Car> getCarsByFoundingYear(Task5Manufacturer manufacturer, int year) {
        return cars.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .filter(car -> car.getYearOfProduction() <= year)
                .toList();
    }
}
