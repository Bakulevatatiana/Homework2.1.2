package driver;

import transtort.Bus;
import transtort.Car;
import transtort.Transport;

public class DriverC extends Driver<Bus> {
    public DriverC(String fullName, String category, int drivingExperience, Bus bus) {
        super(fullName, category, drivingExperience, bus);
    }

    public void have() {
        System.out.println("Имеет категорию С (только грузовые машины)");
    }
}
