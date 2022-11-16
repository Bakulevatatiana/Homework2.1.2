package driver;

import transtort.Automobile;


public class DriverD extends Driver<Automobile> {
    public DriverD(String fullName, String category, int drivingExperience, Automobile car) {
        super(fullName, category, drivingExperience, car);
    }

    public void have() {
        System.out.println("Имеет категорию С (только автобусы)");
    }
}
