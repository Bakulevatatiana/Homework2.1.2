package driver;

import transtort.Car;
import transtort.Truck;


public class DriverD extends Driver<Truck> {
    public DriverD(String fullName, String category, int drivingExperience, Truck truck) {
        super(fullName, category, drivingExperience, truck);
    }

    public void have() {
        System.out.println("Имеет категорию С (только автобусы)");
    }
}
