package driver;

import transtort.Automobile;

public class DriverB extends Driver<Automobile> {
    public DriverB(String fullName, String category, int drivingExperience, Automobile car) {
        super(fullName, category, drivingExperience, car);
    }

    public void have() {
        System.out.println("Имеет категорию В (только легковые автомобили)");
    }
}

