package driver;

import transtort.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String fullName, String category, int drivingExperience, Car car) {
        super(fullName, category, drivingExperience, car);
    }

    public void have() {
        System.out.println("Имеет категорию В (только легковые автомобили)");
    }
}

