package project;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Task5Car {

    private String name;
    private String model;
    private int yearOfProduction;
    private int price;
    private List<Task5Manufacturer> manufacturerList;
    private Task5EngineType engineType;

    public Task5Car(String name, String model, int yearOfProduction, List<Task5Manufacturer> manufacturerList, Task5EngineType engineType) {
        this.name = name;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public List<Task5Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Task5Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public Task5EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(Task5EngineType engineType) {
        this.engineType = engineType;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task5Car car = (Task5Car) o;
        return yearOfProduction == car.yearOfProduction && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturerList, car.manufacturerList) && Objects.equals(engineType, car.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, yearOfProduction, manufacturerList, engineType);
    }
}
